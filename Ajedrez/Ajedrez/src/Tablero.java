import java.util.ArrayList;

public class Tablero {
private ArrayList<Casilla> casillas;
private ArrayList<JuegaPieza> piezas;  
public Tablero (){
   this.piezas  = new ArrayList<JuegaPieza>(); 
   this.casillas=  new ArrayList<Casilla>();
}

public ArrayList<Casilla> getCasillas() {
   String[] letras = {"A","B","C","D","E","F","G","H"};
   int indice=0;
   String color="blanco";
   for(int i=0;i<letras.length;i++){
      for(int j=0; j<8;j++){
         indice=(8*i)+j;
         
         if(color.equals("blanco"))
         {casillas.add(new Casilla(letras[i]+j, "negro"));
         color="negro";
         }

         else if(color.equals("negro"))
         {casillas.add(new Casilla(letras[i]+j, "blanco"));
         color="blanco";
      }
      }

   }
    return casillas;
}
public void mostrarCasillas(){
for (Casilla casilla : casillas) {
   System.out.println(casilla.getPosicion()+casilla.getColor());
}
}

public JuegaPieza agregarPeon(String color){
        
    JuegaPieza peon= new Peon(color);
    return peon;
 }

 public JuegaPieza agregarCaballo(String color){
        
    JuegaPieza peon= new Caballo(color);
    return peon;
 }
 public JuegaPieza agregarAlfil(String color){
        
    JuegaPieza peon= new Alfil(color);
    return peon;
 }

 public JuegaPieza agregarTorre(String color){
        
    JuegaPieza peon= new Torre(color);
    return peon;
 }

 public JuegaPieza agregarRey(String color){
        
    JuegaPieza peon= new Rey(color);
    return peon;
 }
 public JuegaPieza agregarReina(String color){
        
    JuegaPieza peon= new Reina(color);
    return peon;
 }


public void iniciarJuego(){
    for(int i=0;i<8;i++)
    {   
        this.piezas.add(agregarPeon("blanco"));
        this.piezas.add(agregarPeon("negro"));
    }
    for(int j=0;j<2;j++)
    {   
        this.piezas.add(agregarTorre("blanco"));
        this.piezas.add(agregarTorre("negro"));
        this.piezas.add(agregarAlfil("blanco"));
        this.piezas.add(agregarAlfil("negro"));
        this.piezas.add(agregarCaballo("blanco"));
        this.piezas.add(agregarCaballo("negro"));
    }
this.piezas.add(agregarRey("blanco"));
this.piezas.add(agregarRey("negro"));
this.piezas.add(agregarReina("blanco"));
this.piezas.add(agregarReina("negro"));

}



}

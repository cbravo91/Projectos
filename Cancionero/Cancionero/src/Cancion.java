public class Cancion {
    private String nombre;
    private String artista;
    private String album;
    private double duracion;

    public Cancion(String nombre,String artista,String album, double duracion){
        this.nombre= nombre;
        this.artista= artista;
        this.album= album;
        this.duracion=duracion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getAlbum() {
        return album;
    }
    public String getArtista() {
        return artista;
    }
    public double getDuracion() {
        return duracion;
    }

    public String toString() {    
       
        return "Cancion :" +nombre;    
    }  
}

import java.util.ArrayList;
public  class Administrador {
private ArrayList<Usuario> usuarios;
private ArrayList<String> bebidasyColaciones;
    private static final Administrador admin = new Administrador();
    private Administrador() {  
        this.usuarios=new ArrayList<Usuario>();
        this.bebidasyColaciones= new ArrayList<String>();
    }

    public static Administrador getAdmin(){
        return admin;
    }
public void agregarUsuario(String nombre, String pass){
    this.usuarios.add(new Usuario(nombre, pass));
}
public void quitarUsuario(String nombre){
    for (Usuario usuario : usuarios) {
        if (usuario.getNombre().equals(nombre))
        this.usuarios.remove(usuario);
    }
}

public void cargarBebida(String bebida)
{
    this.bebidasyColaciones.add(bebida);
}
public void cargarColacion(String colacion)
{
    this.bebidasyColaciones.add(colacion);
}

}

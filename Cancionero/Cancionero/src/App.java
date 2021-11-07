public class App {
    public static void main(String[] args) throws Exception {
      
        IReproducible comun= new UsuarioComun();
        IReproducible premium= new UsuarioPremium();
       Usuario usuario = new Usuario(comun,"pepe123","asdfasdg");

       Cancion cancion= new Cancion("Song 2", "Blur", "Blur", 3.23);
       Cancion cancion2= new Cancion("Money", "Pink Floyd", "Dark side of the moon",5);
       usuario.setUsuario(premium);
       Playlist playlist= usuario.crearPlaylist("lista");
       usuario.agregarCancion(cancion,playlist);
       usuario.agregarCancion(cancion2,playlist);
       usuario.reproducirCancion(cancion);
     
       JSONparser.loadPlaylist(playlist);


       
       
    
    

       
    }
}

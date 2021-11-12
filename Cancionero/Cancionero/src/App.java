import java.util.ArrayList;

import org.json.JSONArray;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        IReproducible comun = new UsuarioComun();
        IReproducible premium = new UsuarioPremium();
        System.out.println(premium.getClass().getName());
        Usuario usuario = new Usuario(comun, "pepe123", "asdfasdg");
        Usuario usuario2 = new Usuario(premium, "Sara", "asdf234g");
        usuarios.add(usuario);
        usuarios.add(usuario2);

        Cancion cancion = new Cancion("Song 2", "Blur", "Blur", 3.23);
        Cancion cancion2 = new Cancion("Money", "Pink Floyd", "Dark side of the moon", 5);
        usuario.setUsuario(premium);
        Playlist playlist = usuario.crearPlaylist("lista");

        usuario.agregarCancion(cancion, playlist);
        usuario.agregarCancion(cancion2, playlist);
        ArrayList<Playlist> playlists = usuario.agregarPlaylist(playlist);
        usuario.reproducirCancion(cancion);

        JSONparser.addSong(cancion);
        JSONparser.addPlaylist(playlist);
        JSONparser.loadUser(usuario2);
        JSONparser.loadUser(usuario);
        JSONreader.readJSON();
    }
}

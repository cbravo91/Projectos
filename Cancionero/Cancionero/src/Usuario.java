import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String password;
    private ArrayList<Playlist> listas;

    private IReproducible reproducible;

    public Usuario(IReproducible tipoUsuario, String nombre, String password) {
        this.reproducible = tipoUsuario;
        this.nombre = nombre;
        this.password = password;
        this.listas = new ArrayList<Playlist>();
    }

    public void setUsuario(IReproducible usuario) {
        this.reproducible = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCancion(Cancion cancion, Playlist playlist) {
        this.reproducible.agregarCancion(cancion, playlist);

    }

    public void reproducirCancion(Cancion cancion) {
        this.reproducible.playSong(cancion);
    }

    public void playAleatorio() {
        this.reproducible.playShuffle();
    }

    public Playlist crearPlaylist(String nombre) {
        this.reproducible.crearPlaylist(nombre);

        return new Playlist(nombre);

    }

    public ArrayList<Playlist> agregarPlaylist(Playlist playlist) {
        this.reproducible.agregarPlaylist(playlist);
        this.listas.add(playlist);
        return listas;
    }

}

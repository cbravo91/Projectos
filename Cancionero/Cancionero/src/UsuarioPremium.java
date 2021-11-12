public class UsuarioPremium implements IReproducible {

    @Override
    public void playSong(Cancion cancion) {
        // TODO Auto-generated method stub

    }

    @Override
    public void agregarCancion(Cancion cancion, Playlist playlist) {
        playlist.agregarCancion(cancion);
        System.out.println("Se agregó: " + cancion.getNombre() + "a la lista en calidad premium");

    }

    @Override
    public void playShuffle() {
        // TODO Auto-generated method stub

    }

    public void crearPlaylist() {

    }

    public Playlist crearPlaylist(String nombre) {

        return new Playlist(nombre);

    }

    @Override
    public void agregarPlaylist(Playlist playlist) {

    }

}

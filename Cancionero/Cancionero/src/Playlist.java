import java.util.ArrayList;

public class Playlist {
    private String nombre;

    private ArrayList<Cancion> canciones;

    public Playlist(String nombre) {

        this.nombre = nombre;
        this.canciones = new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

}

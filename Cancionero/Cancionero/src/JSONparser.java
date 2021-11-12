import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class JSONparser {

    private static JSONArray playlists = new JSONArray();
    private static JSONArray usuarios = new JSONArray();
    private static JSONObject mainJson = new JSONObject();

    public static JSONObject addSong(Cancion cancion) {
        JSONObject datosCancion = new JSONObject();
        datosCancion.put("Nombre", cancion.getNombre());
        datosCancion.put("Artista", cancion.getArtista());
        datosCancion.put("Album", cancion.getAlbum());
        datosCancion.put("Duración", cancion.getDuracion());
        AtomicInteger idCancion = new AtomicInteger();
        JSONObject objCancion = new JSONObject();
        objCancion.put(idCancion.getAndIncrement(), datosCancion);
        return objCancion;

    }

    public static JSONObject addUser(Usuario usuario) {
        JSONObject datosUser = new JSONObject();
        datosUser.put("Nombre", usuario.getNombre());
        AtomicInteger idUser = new AtomicInteger();
        JSONObject objUser = new JSONObject();
        objUser.put(idUser.getAndIncrement(), datosUser);
        return objUser;

    }

    public static void loadUser(Usuario user) {
        JSONObject estructura = new JSONObject();
        JSONObject objUser = addUser(user);
        estructura.put(user.getNombre(), objUser);
        usuarios.add(estructura);
        escribirJSON(mainJson);
    }

    public static void addPlaylist(Playlist pl) {
        JSONArray playlist = new JSONArray();
        JSONObject estructura = new JSONObject();
        for (Cancion cancion : pl.getCanciones()) {
            JSONObject objCancion = addSong(cancion);
            playlist.add(objCancion);

        }
        estructura.put(pl.getNombre(), playlist);
        playlists.add(estructura);
        escribirJSON(mainJson);
    }

    private static void escribirJSON(JSONObject object) {
        object.clear();
        object.put("Playlists", playlists);
        object.put("Usuarios", usuarios);
        try (FileWriter file = new FileWriter("Cancionero/src/bd.json")) {
            file.write(object.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

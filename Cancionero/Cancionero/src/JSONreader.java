import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONreader {
    private static ArrayList<Playlist> instanciedPlaylist= new ArrayList<Playlist>();
    private static JSONArray usuarios = new JSONArray();
    private static JSONArray playlists = new JSONArray();

    public static void readJSON(){
        JSONParser parser= new JSONParser();
       
        try (FileReader fileReader= new FileReader("Cancionero/src/bd_copy.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            playlists= (JSONArray) jsonObject.get("Playlists");
            for (Object object : playlists) {
               JSONObject playlist = (JSONObject) object;
               JSONArray cancionesJSON= (JSONArray) playlist.get("JSON_JAVA");
               ArrayList<Cancion> canciones= new ArrayList<Cancion>();
               
               for (Object objCancion : canciones) {
                   JSONObject cancionObj= (JSONObject) objCancion;
                   canciones.add(new Cancion((String)cancionObj.get("Nombre"),(String)cancionObj.get("Artista"),(String)cancionObj.get("Album"),
                   (double)cancionObj.get("Duración")));
               }
               Playlist actual= new Playlist(cancionesJSON.toString());
              instanciedPlaylist.add(actual);
            }

        } catch (Exception e) {
           e.printStackTrace();
        }
    }

}

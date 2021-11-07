import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;



public class JSONparser {
    
   public static JSONObject  addSong(Cancion cancion){
JSONObject datosCancion = new JSONObject();
datosCancion.put("Nombre", cancion.getNombre());
datosCancion.put("Artista", cancion.getArtista());
datosCancion.put("Album", cancion.getAlbum());
datosCancion.put("Duración", cancion.getDuracion());

JSONObject objCancion = new JSONObject();
objCancion.put("1"+cancion.getNombre(), datosCancion);
return objCancion;
}

public static void loadPlaylist(Playlist playlist){
Iterator<Cancion> it= playlist.getCanciones().iterator();
JSONArray list = new JSONArray();
while(it.hasNext())
{ 
    list.add(addSong(it.next()));
    escribirJSON(list);
}
}

private static void escribirJSON(JSONObject object){
    try(FileWriter file= new FileWriter("Cancionero/src/bd.json")){
        file.write(object.toJSONString());
        file.flush();
    }
    catch(IOException e){
        e.printStackTrace();
    }
}

private static void escribirJSON(JSONArray object){
    try(FileWriter file= new FileWriter("./src/bd.json")){
        file.write(object.toJSONString());
        file.flush();
    }
    catch(IOException e){
        e.printStackTrace();
    }
}


}



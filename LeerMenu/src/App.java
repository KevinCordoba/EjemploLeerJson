import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App {
    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();

        FileReader reader = new FileReader("C:\\Users\\kevin\\Desktop\\LeerMenu\\Menu.json");

        Object obj = parser.parse(reader);

        JSONObject pJsonObj = (JSONObject)obj;

       JSONArray array = (JSONArray)pJsonObj.get("PlatoFuerte");

         for(int i = 0; i < array.size(); i++){
            JSONObject PlatoFuerte = (JSONObject)array.get(i);

            String nombrePlato = (String) PlatoFuerte.get("nombre");
            Long precioPlato = (Long) PlatoFuerte.get("precio");
            Long duracionPlato = (Long) PlatoFuerte.get("duracion");
            String tamanoPlato = (String) PlatoFuerte.get("tamaño"); 

            System.out.println( "\nLos Platos fuertes son: ");
            System.out.println( "Nombre del plato: " + nombrePlato);
            System.out.println( "Precio: " + precioPlato);
            System.out.println( "Duracion: " + duracionPlato);
            System.out.println( "Tamaño: " + tamanoPlato); 
        } 


    }
}
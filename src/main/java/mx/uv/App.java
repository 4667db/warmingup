package mx.uv;

import static spark.Spark.*;
import com.google.gson.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // prueba
        before((rq, rs) -> rs.type("application/json"));
        get("/hola", (rq, rs) -> {
            JsonObject respuesta = new JsonObject();
            respuesta.addProperty("msj", "hola");
            return respuesta;
        });
    }
}

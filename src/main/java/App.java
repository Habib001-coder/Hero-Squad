import java.util.HashMap;

public class App {
    public static void main( String[] args ) {
        map<String, Object> model = new HashMap<~>();
        ProcessBuilder process = new ProcessBuilder( );
        Integer port;
        If (process.environment().get("PORT") !=null){
            port = Integer.parseInt( process.environment().get( "PORT" ) );
        }else {
            port = 4567;
        }
        setPort(port);
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {


        }

}

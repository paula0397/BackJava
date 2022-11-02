package RepasoCompleto;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    //se define una constante asi:
    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Connection connection = null;
        DriverManager driverManager = null;

        try{


        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        connection = driverManager.getConnection("url", "user", "pass" );
    } catch (Exception exception){
        LOGGER.error("ERROR");

    }


        LOGGER.info("Esto es un mensaje informativo");

        LOGGER.error("Esto es un error");

    }
}

package dat;

import dat.config.ApplicationConfig;
import dat.config.Populate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting server...");

        ApplicationConfig.startServer(7070);
        Populate.main(args);
    }
}
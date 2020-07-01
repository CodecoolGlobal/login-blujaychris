package main;

import com.sun.net.httpserver.HttpServer;
import controller.Static;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/login", new Login());
        server.createContext("/static", new Static());
        server.setExecutor(null);
        server.start();
    }

}

package com.rose.example.consumer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServerCheck {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

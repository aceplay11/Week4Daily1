package com.example.week4daily1.model.datasource.remote;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnection {

    public String getJsonFromGitHub(){

        String jsonResult = " ";
        HttpURLConnection httpUrlConnection = null;

        try {
            URL gitHubURL = new URL("https://api.github.com/users/aceplay11");
            httpUrlConnection = (HttpURLConnection) gitHubURL.openConnection();
            InputStream inputStream = httpUrlConnection.getInputStream();
            int currentReadAsciValue = inputStream.read();
            while (currentReadAsciValue != -1){
                char currentChar = (char) currentReadAsciValue;
                currentReadAsciValue = inputStream.read();
                jsonResult = jsonResult + currentChar;
            }
        }catch (Exception e){

        } finally {
            if (httpUrlConnection != null)
                httpUrlConnection.disconnect();
        }
        return jsonResult;
    }


}

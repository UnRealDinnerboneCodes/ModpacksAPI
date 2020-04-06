package com.unrealdinnerbone.modpackapi;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

class ModpackAPIUtils {

    public static final String BASE_URL = "https://api.modpacks.ch/";
    private static final Gson GSON = new Gson();

    public static String get(String dataURL) {
        return getFromURL(BASE_URL + dataURL);
    }

    public static <T> T get(Class<T> tClass, String urlData) {
        String theUrlData = get(urlData);
        if(theUrlData != null) {
            try {
                return GSON.fromJson(theUrlData, tClass);
            }catch (JsonSyntaxException e) {
                throw new RuntimeException("error while parsing json, is your input correct?");
            }
        }else {
            return null;
        }
    }


    private static String getFromURL(String theURL) {
        try {
            URL url = new URL(theURL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream(), StandardCharsets.UTF_8));
            return reader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String encode(String toencode) {
        try {
            return URLEncoder.encode(toencode, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}

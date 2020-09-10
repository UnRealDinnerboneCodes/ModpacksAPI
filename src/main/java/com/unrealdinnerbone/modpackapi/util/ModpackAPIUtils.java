package com.unrealdinnerbone.modpackapi.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class ModpackAPIUtils {

    public static final String BASE_URL = "https://api.modpacks.ch/";
    public static final Gson GSON = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().serializeNulls().create();

    public static String get(String dataURL) {
        return getFromURL(BASE_URL + dataURL);
    }

    public static <T> ReturnResult<T> get(Class<T> tClass, String urlData) {
        String theUrlData = get(urlData);
        return theUrlData != null ? new ReturnResult<>(theUrlData, tClass) : null;
    }

    public static String getFromURL(String theURL) {
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

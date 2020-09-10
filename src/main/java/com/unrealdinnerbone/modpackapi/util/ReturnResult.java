package com.unrealdinnerbone.modpackapi.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class ReturnResult<T> {
    private final static JsonParser PARSER = new JsonParser();
    private final String value;
    private final Class<T> tClass;
    private T t;

    public ReturnResult(String value, Class<T> tClass) {
        this.value = value;
        this.tClass = tClass;
    }

    public String getRawValue() {
        return value;
    }

    public T get() {
        if(t == null) {
            t = ModpackAPIUtils.GSON.fromJson(value, tClass);
        }
        return t;
    }

    public String getReformtedJson() {
        return ModpackAPIUtils.GSON.toJson(get());
    }

    public String getFormattedJson() {
        JsonElement jsonElement = PARSER.parse(value);
        JsonElement theRealJson = null;
        if(jsonElement.isJsonArray()) {
            theRealJson = jsonElement.getAsJsonArray();
        } else if(jsonElement.isJsonObject()) {
            theRealJson = jsonElement.getAsJsonObject();
        }
        return ModpackAPIUtils.GSON.toJson(theRealJson);
    }
}

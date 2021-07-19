package com.unrealdinnerbone.modpackapi.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class ReturnResult<T> {
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
            t = parse(value, tClass).orElseThrow();
        }
        return t;
    }

//    public String getReformtedJson() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        objectMapper.
//        return ModpackAPIUtils.GSON.toJson(get());
//    }

//    public String getFormattedJson() {
//        JsonElement jsonElement = PARSER.parse(value);
//        JsonElement theRealJson = null;
//        if(jsonElement.isJsonArray()) {
//            theRealJson = jsonElement.getAsJsonArray();
//        } else if(jsonElement.isJsonObject()) {
//            theRealJson = jsonElement.getAsJsonObject();
//        }
//        return ModpackAPIUtils.GSON.toJson(theRealJson);
//    }

    @NotNull
    public static <T> Optional<T> parse(String string, Class<T> tClass) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            return Optional.ofNullable(objectMapper.readValue(string, tClass));
        }catch(JsonProcessingException e) {
            return Optional.empty();
        }
    }

}

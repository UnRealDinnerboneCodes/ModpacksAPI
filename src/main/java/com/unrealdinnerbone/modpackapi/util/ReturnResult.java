package com.unrealdinnerbone.modpackapi.util;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import dev.zacsweers.moshix.records.RecordsJsonAdapterFactory;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ReturnResult<T> {

    public static final Moshi MOSHI = new Moshi.Builder().add(new RecordsJsonAdapterFactory()).build();

    private static final Logger LOGGER = LoggerFactory.getLogger(ReturnResult.class);

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

    @Nullable
    public T get() {
        if (t == null) {
            try {
                t = parse(value, tClass);
            } catch (IOException | AssertionError e) {
                e.printStackTrace();
                LOGGER.error("Error parsing json data", e);
                return null;
            }
        }
        return t;
    }

    public Class<T> getClazz() {
        return tClass;
    }

    public static <T> T parse(String string, Class<T> tClass) throws JsonDataException, IOException {
        return MOSHI.adapter(tClass).fromJson(string);
    }

}

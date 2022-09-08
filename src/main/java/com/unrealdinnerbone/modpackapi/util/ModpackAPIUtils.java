package com.unrealdinnerbone.modpackapi.util;

import com.unrealdinnerbone.unreallib.apiutils.APIUtils;
import com.unrealdinnerbone.unreallib.apiutils.ReturnResult;

public class ModpackAPIUtils {

    public static final String BASE_URL = System.getenv().getOrDefault("MODPACKS_API_URL", "https://api.modpacks.ch/");

    public static <T> ReturnResult<T> get(Class<T> tClass, String urlData) {
        return APIUtils.get(tClass, BASE_URL + urlData);
    }

}

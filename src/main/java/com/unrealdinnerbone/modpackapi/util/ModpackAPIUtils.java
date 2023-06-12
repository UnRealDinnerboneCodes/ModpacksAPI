package com.unrealdinnerbone.modpackapi.util;

import com.unrealdinnerbone.unreallib.apiutils.APIUtils;
import com.unrealdinnerbone.unreallib.apiutils.IResult;
import com.unrealdinnerbone.unreallib.apiutils.ResponseData;
import com.unrealdinnerbone.unreallib.web.HttpHelper;
import org.jetbrains.annotations.NotNull;

public class ModpackAPIUtils {

    public static final String BASE_URL = System.getenv().getOrDefault("MODPACKS_API_URL", "https://api.modpacks.ch/");

    public static @NotNull <T> IResult<T> get(Class<T> tClass, String urlData) {
        return APIUtils.get(HttpHelper.DEFAULT, tClass, BASE_URL + urlData)
                .map(ResponseData::data);
    }

}

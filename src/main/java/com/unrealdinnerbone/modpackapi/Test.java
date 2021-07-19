package com.unrealdinnerbone.modpackapi;

import com.unrealdinnerbone.modpackapi.api.pack.ModpackVersion;

public class Test {
    public static void main(String[] args) {
        for (ModpackVersion version : ModpackAPI.getModpack(79).get().versions()) {
            System.out.println(version);
        }
    }
}

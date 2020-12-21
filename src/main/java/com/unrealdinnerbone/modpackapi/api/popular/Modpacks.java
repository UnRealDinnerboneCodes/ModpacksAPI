package com.unrealdinnerbone.modpackapi.api.popular;

import lombok.Getter;

@Getter
public class Modpacks {
    private int[] packs;
    private int total;
    private long refreshed;
    private String status;
}

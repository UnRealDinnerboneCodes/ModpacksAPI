package com.unrealdinnerbone.modpackapi.api.popular;

import lombok.Getter;

@Getter
public class PopularTyped {
    private int[] packs;
    private int total;
    private String type;
    private int limit;
    private long refreshed;
}

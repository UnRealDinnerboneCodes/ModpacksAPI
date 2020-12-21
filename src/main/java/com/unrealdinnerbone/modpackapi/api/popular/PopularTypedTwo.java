package com.unrealdinnerbone.modpackapi.api.popular;

import lombok.Getter;

@Getter
public class PopularTypedTwo {
    private int[] packs;
    private int total;
    private String type;
    private int limit;
    private String status;
    private long refreshed;
}

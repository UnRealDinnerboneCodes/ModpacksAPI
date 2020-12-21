package com.unrealdinnerbone.modpackapi.api.popular;

import lombok.Getter;

@Getter
public class PopularStatus {
    private int[] packs;
    private int total;
    private int limit;
    private String status;
    private long refreshed;
}

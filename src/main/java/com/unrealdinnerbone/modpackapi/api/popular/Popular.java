package com.unrealdinnerbone.modpackapi.api.popular;

import lombok.Getter;

@Getter
public class Popular {

    private int[] packs;
    private int total;
    private int limit;
    private long refreshed;
}

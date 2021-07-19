package com.unrealdinnerbone.modpackapi.api.popular;

public record PopularTyped(int[] packs, int total, String type, String status, int limit, long refreshed) { }

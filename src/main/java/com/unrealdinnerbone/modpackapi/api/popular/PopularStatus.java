package com.unrealdinnerbone.modpackapi.api.popular;

public record PopularStatus(int[] packs, int total, int limit, String status, long refreshed) {}

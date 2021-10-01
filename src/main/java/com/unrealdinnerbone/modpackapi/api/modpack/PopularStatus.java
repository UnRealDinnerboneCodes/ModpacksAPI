package com.unrealdinnerbone.modpackapi.api.modpack;

public record PopularStatus(int[] packs, int total, int limit, String status, long refreshed) {}

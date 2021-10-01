package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.IListResult;

public record ModpackSearch(int[] packs, int[] curseforge, int total, int limit, long refreshed) implements IListResult {}

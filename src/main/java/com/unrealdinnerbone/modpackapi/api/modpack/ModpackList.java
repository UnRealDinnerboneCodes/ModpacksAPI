package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.IListResult;

public record ModpackList(int[] packs, int total, int limit, long refreshed) implements IListResult {}

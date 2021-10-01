package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.IListResult;
import com.unrealdinnerbone.modpackapi.api.base.IStatus;

public record ModpackPopularStatus(int[] packs, int total, String type, int limit, String status, long refreshed) implements IListResult, IStatus {}

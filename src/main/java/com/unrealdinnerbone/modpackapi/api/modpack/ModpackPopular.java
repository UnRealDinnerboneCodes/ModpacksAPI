package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.IListResult;
import com.unrealdinnerbone.modpackapi.api.base.IStatus;

public record ModpackPopular(int[] packs, int total, int limit, String status, long refreshed) implements IListResult, IStatus {}

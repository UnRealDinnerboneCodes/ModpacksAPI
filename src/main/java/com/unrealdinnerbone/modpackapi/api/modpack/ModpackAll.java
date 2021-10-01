package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.IStatus;

public record ModpackAll(int[] packs, int total, long refreshed, String status) implements IStatus {}

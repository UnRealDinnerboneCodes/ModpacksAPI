package com.unrealdinnerbone.modpackapi.api.mods.manifest;

import com.unrealdinnerbone.modpackapi.api.base.IArt;

public record ModArt(int width, int height, boolean compressed, String url, String type) implements IArt {}

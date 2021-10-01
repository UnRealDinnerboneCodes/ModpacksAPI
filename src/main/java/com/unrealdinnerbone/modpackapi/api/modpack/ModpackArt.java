package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.IArt;

public record ModpackArt(int width, int height, boolean compressed, String url, String sha1, int size, int id, String type, long updated) implements IArt {}

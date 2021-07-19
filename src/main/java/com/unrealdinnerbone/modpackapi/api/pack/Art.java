package com.unrealdinnerbone.modpackapi.api.pack;

public record Art(int width, int height, boolean compressed, String url, String sha1, int size, int id, String type, long updated) {}

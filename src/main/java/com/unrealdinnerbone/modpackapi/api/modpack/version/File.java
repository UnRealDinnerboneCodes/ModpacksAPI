package com.unrealdinnerbone.modpackapi.api.modpack.version;

public record File(String version, String path, String url, String sha1, int size, String[] tags, boolean clientonly, boolean serveronly, boolean optional, int id, String name, String type, long updated) {}

package com.unrealdinnerbone.modpackapi.api.mods;

import com.unrealdinnerbone.modpackapi.api.base.Author;
import com.unrealdinnerbone.modpackapi.api.base.IStatus;
import com.unrealdinnerbone.modpackapi.api.mods.manifest.ModArt;
import com.unrealdinnerbone.modpackapi.api.base.Link;
import com.unrealdinnerbone.modpackapi.api.mods.manifest.ModVersion;

import java.util.List;
import java.util.stream.LongStream;

public record ModManifest(String synopsis, String description, List<ModArt> art, List<Link> links, List<Author> authors, List<ModVersion> versions,
                          int installs, String status, int id, String name, String type, long updated, long refreshed) implements IStatus {}

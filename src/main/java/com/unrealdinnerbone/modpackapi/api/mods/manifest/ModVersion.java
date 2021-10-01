package com.unrealdinnerbone.modpackapi.api.mods.manifest;

import com.unrealdinnerbone.modpackapi.api.base.IVersion;
import com.unrealdinnerbone.modpackapi.api.modpack.version.Target;

import java.util.List;

public record ModVersion(List<Target> targets, String version, String path, String url, String sha1, int size,
                         boolean clientonly, int id, String name, String type, long updated, List<ModDependency> dependencies) implements IVersion {}

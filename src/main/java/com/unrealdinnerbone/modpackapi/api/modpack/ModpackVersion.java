package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.IVersion;
import com.unrealdinnerbone.modpackapi.api.modpack.version.Spec;

//Todo Spec specs,
public record ModpackVersion(int id, String name, String type, long updated) implements IVersion {}

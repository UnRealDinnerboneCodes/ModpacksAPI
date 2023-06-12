package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.IVersion;
import com.unrealdinnerbone.modpackapi.api.modpack.version.Target;

import java.util.List;

//Todo Spec specs,
public record ModpackVersion(int id, String name, String type, long updated, List<Target> targets) implements IVersion {}

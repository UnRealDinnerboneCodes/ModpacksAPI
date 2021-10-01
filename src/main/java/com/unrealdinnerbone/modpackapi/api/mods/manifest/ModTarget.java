package com.unrealdinnerbone.modpackapi.api.mods.manifest;

import com.unrealdinnerbone.modpackapi.api.base.ITarget;

public record ModTarget(String version, String name, String type, long updated) implements ITarget {}

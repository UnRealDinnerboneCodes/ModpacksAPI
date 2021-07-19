package com.unrealdinnerbone.modpackapi.api.pack;

import com.unrealdinnerbone.modpackapi.api.version.Spec;

public record ModpackVersion(Spec specs, int id, String name, String type, long updated) {
}

package com.unrealdinnerbone.modpackapi.api.version;

import java.util.List;

public record Version(List<File> files, Spec specs, List<Target> targets, int installs, int plays, long refreshed, String changelog, int parent, String notification, Object[] links, String status, int id, String name, String type, long updated) {}


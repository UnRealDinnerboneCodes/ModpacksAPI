package com.unrealdinnerbone.modpackapi.api.modpack.version;

import com.unrealdinnerbone.modpackapi.api.base.IStatus;

import java.util.List;

//Todo Spec specs,
public record VersionManifest(List<File> files,  List<Target> targets, int installs, int plays, long refreshed, String changelog, int parent, String notification, Object[] links, String status, int id, String name, String type, long updated) implements IStatus {}


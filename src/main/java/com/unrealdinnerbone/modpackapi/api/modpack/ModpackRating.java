package com.unrealdinnerbone.modpackapi.api.modpack;

public record ModpackRating(int id, boolean configured, boolean verified, int age, boolean gambling, boolean frightening, boolean alcoholdrugs, boolean nuditysexual, boolean sterotypeshate, boolean language, boolean violence) {}

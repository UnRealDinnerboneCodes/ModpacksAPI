package com.unrealdinnerbone.modpackapi.api.modpack;

import com.unrealdinnerbone.modpackapi.api.base.Author;
import com.unrealdinnerbone.modpackapi.api.base.IStatus;
import com.unrealdinnerbone.modpackapi.api.base.Link;

import java.util.List;

public record ModpackManifest(String synopsis, String description, List<ModpackArt> art, List<Link> links, List<Author> authors,
                              List<ModpackVersion> versions, int installs,
                              int plays, List<ModpackTag> tags, boolean featured, long refreshed, String notification,
                              ModpackRating rating, String status, int id,
                              String name, String type, long updated) implements IStatus {}

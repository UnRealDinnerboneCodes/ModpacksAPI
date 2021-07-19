package com.unrealdinnerbone.modpackapi.api.pack;

import java.util.List;

public record Modpack(String synopsis, String description, List<Art> art, List<Object> links, List<Author> authors,
                      List<ModpackVersion> versions, int installs,
                      int plays, boolean featured, long refreshed, String notification,
                      Rating rating, String status, int id,
                      String name, String type, long updated,
                      List<Tag> tags) {
}

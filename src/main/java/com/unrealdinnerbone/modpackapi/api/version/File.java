package com.unrealdinnerbone.modpackapi.api.version;

import lombok.Getter;

@Getter
public class File {
    private String version;
    private String path;
    private String url;
    private String sha1;
    private int size;
    private String[] tags;
    private boolean clientonly;
    private boolean serveronly;
    private boolean optional;
    private int id;
    private String name;
    private String type;
    private long updated;
}

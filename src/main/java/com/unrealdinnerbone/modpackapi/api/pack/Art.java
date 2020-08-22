package com.unrealdinnerbone.modpackapi.api.pack;

import lombok.Getter;

@Getter
public class Art {
    private int width;
    private int height;
    private boolean compressed;
    private String url;
    private String sha1;
    private int size;
    private int id;
    private String type;
    private long updated;
}

package com.unrealdinnerbone.modpackapi.api.version;

import com.unrealdinnerbone.modpackapi.api.base.BaseVersion;
import lombok.Getter;

import java.util.List;

@Getter
public class Version extends BaseVersion {
    private List<File> files;
    private Spec specs;
    private List<Target> targets;
    private int installs;
    private int plays;
    private long refreshed;
    private String changelog;
    private int parent;
    private String notification;
    private Object[] links;
    private String status;

}


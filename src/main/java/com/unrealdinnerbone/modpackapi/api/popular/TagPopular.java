package com.unrealdinnerbone.modpackapi.api.popular;

import lombok.Getter;

import java.util.List;

@Getter
public class TagPopular {
    private List<String> tags;
    private int total;
    private int limit;
    private long refreshed;
    private String status;
}

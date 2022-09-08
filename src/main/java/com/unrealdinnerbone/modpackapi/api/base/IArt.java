package com.unrealdinnerbone.modpackapi.api.base;

public interface IArt
{
    int width();
    int height();
    boolean compressed();
    String type();

    String[] mirrors();
}

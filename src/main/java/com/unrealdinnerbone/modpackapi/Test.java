package com.unrealdinnerbone.modpackapi;

import java.util.Arrays;

public class Test
{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ModpackAPI.searchForPack(10, "FTB A").getPacks()));
    }
}

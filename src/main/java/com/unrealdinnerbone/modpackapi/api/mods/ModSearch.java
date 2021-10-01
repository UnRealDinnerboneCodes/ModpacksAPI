package com.unrealdinnerbone.modpackapi.api.mods;

import com.unrealdinnerbone.modpackapi.api.base.IListResult;
import com.unrealdinnerbone.modpackapi.api.base.IStatus;

import java.util.List;

public record ModSearch(List<Integer> mods, int total, int limit, long refreshed, String status) implements IListResult, IStatus {}

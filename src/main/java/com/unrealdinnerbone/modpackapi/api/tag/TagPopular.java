package com.unrealdinnerbone.modpackapi.api.tag;

import com.unrealdinnerbone.modpackapi.api.base.IListResult;
import com.unrealdinnerbone.modpackapi.api.base.IStatus;

import java.util.List;

public record TagPopular(List<String> tags, int total, int limit, long refreshed, String status) implements IListResult, IStatus {}

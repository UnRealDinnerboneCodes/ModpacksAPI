package com.unrealdinnerbone.modpackapi.api.popular;

import java.util.List;

public record TagPopular(List<String> tags, int total, int limit, long refreshed, String status) {}

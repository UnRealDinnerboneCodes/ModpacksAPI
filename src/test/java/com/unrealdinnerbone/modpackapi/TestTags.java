package com.unrealdinnerbone.modpackapi;

import org.junit.Test;

public class TestTags extends BaseTest
{
    @Test
    public void testMostUsedTag() {
        test(ModpackAPI.Tags.getMostUsedTag(100));
    }
}

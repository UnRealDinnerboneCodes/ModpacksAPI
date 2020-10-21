package com.unrealdinnerbone.modpackapi;

import com.unrealdinnerbone.modpackapi.util.ReturnResult;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

public class JsonTest {

    @Test
    public void testModpack() {
        test(ModpackAPI.getModpack(20));
    }

    @Test
    public void testModPackVersion() {
        test(ModpackAPI.getVersion(20, 102));
    }

    @Test
    public void testVersionChangelog() {
        test(ModpackAPI.getVersionChangelog(20, 102));
    }
    @Test
    public void testMostPlayed() {
        test(ModpackAPI.getMostPlayed(100));
    }
    @Test
    public void testMostPlayedWithTag() {
        test(ModpackAPI.getMostPlayed( 100, "FTB"));
    }

    @Test
    public void testMostInstalled() {
        test(ModpackAPI.getMostInstalled(100));
    }
    @Test
    public void testMostInstalledWithTag() {
        test(ModpackAPI.getMostInstalled(100, "FTB"));
    }

    @Test
    public void testFeatured() {
        test(ModpackAPI.getFeatured(100));
    }

    @Test
    public void testMostUsedTag() {
        test(ModpackAPI.getMostUsedTag(100));
    }

    @Test
    public void testLastUpdated() {
        test(ModpackAPI.getRecentlyUpdated(100));
    }
    @Test
    public void testPackSearch() {
        test(ModpackAPI.searchForPack(100, "Direwolf"));
    }

    private void test(ReturnResult returnResult) {
        Assert.assertNotNull(returnResult);
        Assert.assertNotNull(returnResult.getFormattedJson());
        Assert.assertNotNull(returnResult.get());
        Assert.assertNotNull(returnResult.getReformtedJson());
        Assert.assertNotNull(returnResult.getRawValue());
        Assert.assertEquals(returnResult.getFormattedJson(), returnResult.getReformtedJson());
    }


}

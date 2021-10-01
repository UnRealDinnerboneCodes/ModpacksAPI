package com.unrealdinnerbone.modpackapi;

import org.junit.Test;

public class TestCurseforge extends BaseTest {

    @Test
    public void getModpack() {
        test(ModpackAPI.Curseforge.getModpack(285109));
    }

    @Test
    public void getModpackVersion() {
        test(ModpackAPI.Curseforge.getVersion(285109, 2519142));
    }

}

package com.unrealdinnerbone.modpackapi;

import com.squareup.moshi.JsonDataException;
import com.unrealdinnerbone.modpackapi.util.ReturnResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class BaseTest {

    protected void test(ReturnResult<?> returnResult) {
        Assert.assertNotNull(returnResult);
        Assert.assertNotNull(returnResult.getRawValue());
        Assert.assertNotNull(returnResult.get());
        Assert.assertNotNull(getReformtedJson(returnResult));
        Assert.assertNotNull(returnResult.getRawValue());

//        Assert.assertArrayEquals(getA(returnResult).keySet().stream().sorted().toArray(), getB(returnResult).keySet().stream().sorted().toArray());
        Assert.assertEquals(aFormat(returnResult), bFormat(returnResult));
    }

    public Map<String, ?> getA(ReturnResult<?> returnResult) {
        return getFor(returnResult.getRawValue());
    }

    public Map<String, ?> getB(ReturnResult<?> returnResult) {
        return getFor(getReformtedJson(returnResult));
    }

    private Map<String, ?> getFor(String s) {
        try {
            Map<String, ?> map = ReturnResult.MOSHI.adapter(Map.class).failOnUnknown().fromJson(s);
            return map;
        }catch (JsonDataException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String aFormat(ReturnResult<?> returnResult) {
        return ReturnResult.MOSHI.adapter(Object.class).indent("    ").lenient().toJson(getA(returnResult));
    }
    public String bFormat(ReturnResult<?> returnResult) {
        return ReturnResult.MOSHI.adapter(Object.class).indent("    ").lenient().toJson(getB(returnResult));
    }

    public <T> String getReformtedJson(ReturnResult<T> returnResult) {
        return ReturnResult.MOSHI.adapter(returnResult.getClazz()).indent("    ").toJson(returnResult.get());
    }

}

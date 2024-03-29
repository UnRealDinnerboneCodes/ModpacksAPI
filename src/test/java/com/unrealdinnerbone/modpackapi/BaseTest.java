//package com.unrealdinnerbone.modpackapi;
//
//import com.unrealdinnerbone.unreallib.json.api.JsonParseException;
//import com.unrealdinnerbone.unreallib.json.JsonUtil;
//import org.junit.Assert;
//
//import java.util.Map;
//
//public abstract class BaseTest {
//
//    protected void test(JsonResult<?> returnResult) {
//        Assert.assertNotNull(returnResult);
//        Assert.assertNotNull(returnResult.getRawValue());
//        Assert.assertNotNull(returnResult.get());
//        Assert.assertNotNull(getReformtedJson(returnResult));
//        Assert.assertNotNull(returnResult.getRawValue());
//
////        Assert.assertArrayEquals(getA(returnResult).keySet().stream().sorted().toArray(), getB(returnResult).keySet().stream().sorted().toArray());
//        Assert.assertEquals(aFormat(returnResult), bFormat(returnResult));
//    }
//
//    public Map<String, ?> getA(JsonResult<?> returnResult) {
//        return getFor(returnResult.getRawValue());
//    }
//
//    public Map<String, ?> getB(JsonResult<?> returnResult) {
//        return getFor(getReformtedJson(returnResult));
//    }
//
//    private Map<String, ?> getFor(String s) {
//        try {
//            Map<String, ?> map = JsonUtil.DEFAULT.parse(Map.class, s);
//            return map;
//        }catch (JsonParseException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public String aFormat(JsonResult<?> returnResult) {
//        return JsonUtil.DEFAULT.toFancyJson(Object.class, getA(returnResult));
//    }
//    public String bFormat(JsonResult<?> returnResult) {
//        return JsonUtil.DEFAULT.toFancyJson(Object.class, getB(returnResult));
//    }
//
//    public <T> String getReformtedJson(JsonResult<T> returnResult) {
//        return JsonUtil.DEFAULT.toFancyJson(returnResult.getClazz(), returnResult.get());
//    }
//
//}

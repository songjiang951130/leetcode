package com.github.songjiang951130.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

public class TransformTest {
    Transform transform = new Transform();

    @Test
    public void toInt() {
        Assert.assertEquals(-1, transform.toInt("-1"));
        Assert.assertEquals(0, transform.toInt("0"));
        Assert.assertEquals(570, transform.toInt("570"));
        Assert.assertEquals(570, transform.toInt("  570"));
        Assert.assertEquals(4193, transform.toInt("4193 with words"));
        Assert.assertEquals(Integer.MIN_VALUE, transform.toInt("-91283472332"));
        Assert.assertEquals(1, transform.toInt("+1"));
        Assert.assertEquals(0, transform.toInt("+-2"));
        Assert.assertEquals(12, transform.toInt(" 0012"));
        Assert.assertEquals(2147483647, transform.toInt("2147483648"));
    }

    @Test
    public void test2Int() {
        Assert.assertEquals(0, transform.toInt("0-1"));
    }
}
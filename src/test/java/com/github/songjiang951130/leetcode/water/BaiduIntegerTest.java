package com.github.songjiang951130.leetcode.water;

import org.junit.Assert;
import org.junit.Test;

public class BaiduIntegerTest {
    BaiduInteger baiduInteger = new BaiduInteger();

    @Test
    public void testInteger() {
        Assert.assertEquals(3, baiduInteger.integerReplacement(8));
        Assert.assertEquals(4, baiduInteger.integerReplacement(7));
        int res = baiduInteger.integerReplacement(65535);
        Assert.assertEquals(17, res);
    }

}

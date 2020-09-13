package com.github.songjiang951130.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class SearchTest {
    Search search = new Search();

    @Test
    public void search() {
        Assert.assertEquals(5, search.search(new int[]{6, 7, 1, 2, 3, 4, 5}, 4));
        /**
         * [4,5,6,7,0,1,2]
         * 0
         */
        Assert.assertEquals(0, search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
    }
}
package com.github.songjiang951130.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

public class DominoTest {
    @Test
    public void testPair(){
        Domino domino = new Domino();
        int[][] case1 = {{1,2},{1,2}};
        Assert.assertEquals(1,domino.numEquivDominoPairs(case1));

        int[][] case2 = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        Assert.assertEquals(3,domino.numEquivDominoPairs(case2));

        int[][] case3 = {{1,1},{2,2},{1,1},{1,2},{1,2},{1,1}};
        Assert.assertEquals(4,domino.numEquivDominoPairs(case3));
    }
}

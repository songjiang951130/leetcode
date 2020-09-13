package com.github.songjiang951130.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
        Square square = new Square();

        @Test
        public void maximalSquare() {
                char[][] case1 = {

                                { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
                                { '1', '0', '0', '1', '0' } };
                Assert.assertEquals(4, square.maximalSquare(case1));
                char[][] case2 = {

                                { '1' } };
                Assert.assertEquals(1, square.maximalSquare(case2));

                char[][] case3 = { { '0' } };
                Assert.assertEquals(0, square.maximalSquare(case3));

                char[][] case4 = { { '0', '1', '0' } };
                Assert.assertEquals(1, square.maximalSquare(case4));

                // char[][] case5 = {
                // {'1', '1'},
                // {'1', '1'}
                // };
                // // Assert.assertEquals(4, square.maximalSquare(case5));

        }
}

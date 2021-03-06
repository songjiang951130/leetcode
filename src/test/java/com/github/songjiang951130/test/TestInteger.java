package com.github.songjiang951130.test;

import org.junit.Test;

public class TestInteger {
    @Test
    public void test(){
        Solution solution = new Solution();
        solution.reverse(-123);
    }

    class Solution {
        public int reverse(int x) {
            int res = 0;
            while(x != 0){
                int pop = x % 10;
                x /= 10;
                if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && pop > 8)) return 0;
                if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && pop < -7)) return 0;
                res = res * 10 + pop;
            }
            return res;
        }
    }
}

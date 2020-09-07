package com.github.songjiang951130.leetcode.water;

public class BaiduInteger {
    /**
     * Given a positive integer n and you can do operations as follow:
     * 
     * If n is even, replace n with n/2. If n is odd, you can replace n with either
     * n + 1 or n - 1. What is the minimum number of replacements needed for n to
     * become 1? <br/>
     * 考点：位运算 <br/>
     * 00 直接移位 <br/>
     * 01 减一处理 <br/>
     * 10 挪位，减一。两次操作 <br/>
     * 11 3→2→1要比3→4→2→1替换次数少 <br/>
     * 397
     * @link <link>https://leetcode-cn.com/problems/integer-replacement/</link>
     * @return
     */
    public int integerReplacement(int n) {

        int times = 0;
        while (n != 1) {
            /**
             * while n>1:
             *             if n==3:
             *                 n-=1
             *             elif n%4==1:
             *                 n-=1
             *             elif n%4==3:
             *                 n+=1
             *             else:
             *                 n/=2
             *             count+=1
             */
            switch (n){
                case 3:


            }

//            if(n % 2 == 0){
//                n = n >> 1;
//            }else{
//                if(n == 3){
//                    times+=2;
//                    break;
//                }else{
//                    n = n - 1;
//                }
//            }
//            times++;
        }
        return times;
    }

}

package com.github.songjiang951130.leetcode.stack;

public class Temperature {

    public int[] waiterTemperature(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int wait = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                wait++;
                if (temperatures[j] > temperatures[i]) {
                    break;
                }else if (j == temperatures.length - 1){
                    wait = 0;
                }
            }
            res[i] = wait;
        }
        return res;
    }
}

package com.github.songjiang951130.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("key", 100);
        handle(map);
        System.out.println(map);
    }

    /**
     * 参数引用类型是 新建了引用地址指向原对象
     * 参数 新指向对象时和原对象脱离关系
     * @param map
     */
    public static void handle(Map<String, Integer> map) {
//        map = new HashMap<>();
        map.put("key", 1);
    }
}

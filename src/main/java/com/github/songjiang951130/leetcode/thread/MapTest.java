package com.github.songjiang951130.leetcode.thread;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    /**
     * 总结
     *     |hashMap|hashtable|concurrenthashmap|
     *  key| √     |×        | ×               |
     * value| √     |×        | ×               |
     *
     * @param args
     */
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
//        map.put(null, null);
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(null, null);

        Map<String, String> hashTable = new Hashtable<>();
        //hashtable 不允许val为空
//        hashTable.put("", null);
        hashTable.put(null, "val");
    }
}

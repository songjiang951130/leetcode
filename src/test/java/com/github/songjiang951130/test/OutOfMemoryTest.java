package com.github.songjiang951130.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryTest {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        // while (true) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add("aaa");
        // }
    }
}

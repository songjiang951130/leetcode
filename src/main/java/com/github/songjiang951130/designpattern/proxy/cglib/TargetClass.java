package com.github.songjiang951130.designpattern.proxy.cglib;

import java.util.Random;

public class TargetClass {
    public int display() {
        Random ram = new Random(10);
        int res = ram.nextInt(100);
        System.out.println("show display:" + res);
        return res;
    }
}

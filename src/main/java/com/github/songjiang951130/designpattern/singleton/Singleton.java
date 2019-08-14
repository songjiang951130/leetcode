package com.github.songjiang951130.designpattern.singleton;

public class Singleton {
    private static Singleton instance = null;

    //不允许实例化
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

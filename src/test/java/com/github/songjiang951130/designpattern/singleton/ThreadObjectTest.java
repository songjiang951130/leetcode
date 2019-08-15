package com.github.songjiang951130.designpattern.singleton;

public class ThreadObjectTest {

    public class Test {
        int times = 1;

        public void display() {
            synchronized (this) {
                System.out.println("time:" + times);
                times++;
            }
        }
    }
}

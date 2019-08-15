package com.github.songjiang951130.designpattern.singleton;

public class Singleton {
    private static Singleton instance = null;

    //不允许实例化
    private Singleton() {
        try {
            //模拟耗时创建,比如链接建立等
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        //第一重检查 检查对象是否创建成功，
        //1、没有则由线程去创建
        //2、有则不进入代码同步块中加快获取对象速度
        if (instance == null) {
            System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " synchronized status:" + (instance == null));
            /**
             * 当创建单例对象时间较长时（故意将构造函数sleep），会有多个线程在此处 等待获取锁 进入同步块（如下日志），同一时间仅有一个线程进入
             * id name
             * 26 Thread-14 synchronized status:true
             * 33 Thread-21 synchronized status:true
             * 35 Thread-23 synchronized status:true
             * 38 Thread-26 synchronized status:true
             * 39 Thread-27 synchronized status:true
             * 36 Thread-24 synchronized status:true
             * 31 Thread-19 synchronized status:false
             * 37 Thread-25 synchronized status:false
             * 32 Thread-20 synchronized status:false
             * 30 Thread-18 synchronized status:false
             */
            synchronized (Singleton.class) {
                System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " start status:" + (instance == null));
                //第二重检查，此处会有多个线程来创建，用于避免多个线程创建对象，破坏了单例模式
                if (instance == null) {
                    System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " create");
                    instance = new Singleton();
                    //此处对象创建完成后即可新进入第一重检查的获取
                }
                System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " end  status:" + (instance == null));
            }
        }
        return instance;
    }

}

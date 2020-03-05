package com.company;

import java.util.Random;

public class BlaBla {
    private String s1;
    private String s2;
    private String s3;
    private final static ThreadLocal<String> localContext = new ThreadLocal<>();

    public static void main(String[] args) {
        String s4 = "10";
        String s = "asdads adad " + s4;
        BlaBla blaBla = new BlaBla();
        Thread t1 = new Thread(() -> blaBla.print());
        Thread t2 = new Thread(() -> blaBla.print());
        Thread t3 = new Thread(() -> blaBla.print());
        Thread t4 = new Thread(() -> blaBla.print());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        perintMessage("abc asdhjasd asdasd");
    }

    static void perintMessage(String message) {
        System.out.println(message);
    }

    void print() {
        try {
            Thread.sleep(new Random().nextInt(((1000-500)+1)+500));
            s1 = Thread.currentThread().getName();
            localContext.set(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        perintMessage(localContext.get());
        perintMessage(Thread.currentThread().getName());

    }
}



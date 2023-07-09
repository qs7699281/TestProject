package com.qianxin.demo.thread;

public class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        System.out.println("我是多线程！");
    }

    public static void main(String[] args) {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo2);
        thread.start();
        System.out.println("我是主线程！");
    }
}

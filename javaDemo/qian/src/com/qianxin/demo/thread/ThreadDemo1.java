package com.qianxin.demo.thread;

public class ThreadDemo1 extends Thread{

    @Override
    public void run() {
        System.out.println("我是多线程！");
    }

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();
        System.out.println("我是主线程！");
    }
}

package com.qianxin.demo.thread;
//模拟龟兔赛跑
public class ThreadDemo3 implements Runnable {

    @Override
    public void run() {
        for (int torDistance=0;torDistance<=10;torDistance++){
            System.out.println(torDistance);
            if (10==torDistance){
                System.out.println("乌龟到达了终点！");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo3 threadDemo3 = new ThreadDemo3();
        new Thread(threadDemo3).start();

        for (int rabbitDistance=0;rabbitDistance<=10;rabbitDistance++){
            System.out.println(rabbitDistance);
            if (5==rabbitDistance){
                Thread.sleep(500);
            }
            if (10==rabbitDistance){
                System.out.println("兔子到达了终点！");
            }
        }
    }
}

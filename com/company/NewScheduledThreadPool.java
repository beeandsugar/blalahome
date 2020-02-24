package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class NewScheduledThreadPool {
    public static void main(String[] args) {
        //创建一个定长线程池，支持定时及周期性任务执行——延迟执行
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 5; i++) {
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException e ){
//                e.printStackTrace();
//            }
            scheduledThreadPool.schedule(new Runnable() {
                public void run() {
                    System.out.println("延迟1秒执行,当前进行的线程是" + Thread.currentThread().getName());
                }
            }, 10, TimeUnit.SECONDS);
        }
    }
}


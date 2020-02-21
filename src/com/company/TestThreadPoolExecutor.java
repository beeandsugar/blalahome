package com.company;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 60L, TimeUnit.SECONDS,new LinkedBlockingQueue<>(1));
        //任务1
        pool.execute(new Runnable() {

            @Override
            public void run() {
                System.out.println("任务1使用的线程是：" + Thread.currentThread().getName());
            }
        });

        try {
            //主线程延迟2秒
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //任务2
        pool.execute(new Runnable() {

            @Override
            public void run() {
                System.out.println("任务2使用的线程是：" + Thread.currentThread().getName());
            }


        });

    }
}

package com.company;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExtendThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(6));
/*        // 任务1
        pool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3 * 1000);
                    System.out.println("任务1使用的是线程：" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // 任务2
        pool.execute(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5 * 1000);
                    System.out.println("任务2使用的是线程：" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });*/

        for (int i=0 ; i < 10; i++){
            // 任务3
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try{
                        Thread.sleep(3*1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("任务3使用的是线程：" + Thread.currentThread().getName());
                }
            });
        }


    }
}

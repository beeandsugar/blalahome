package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++){
                try {
                    System.out.println("输出"+Thread.currentThread().getName() + "当前输出值为" + i);
                    Thread.sleep(200);
                }catch (InterruptedException e ){
                    e.printStackTrace();
                };
            };
                };
            });

        service.execute(new Runnable() {
            @Override
            public void run() {
                for (int y = 20; y < 100 ; y+=10){
                    System.out.println("当前线程为" + Thread.currentThread().getName() + "输出为" + y);
                }
            }
        });
    }
}

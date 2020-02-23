package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class NewFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            service.execute(new NumThread());
        } ;
    }
}

class   NumThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正在执行的线程是" + Thread.currentThread().getName());
    }
}


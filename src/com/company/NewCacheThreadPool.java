package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCacheThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0; i < 4; i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e ){
                e.printStackTrace();
            }
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("当前正在被执行的线程是" + Thread.currentThread().getName());
                }
        }


        );   //执行run()方法
//        service.shutdown();  //关闭连接池
    }}}

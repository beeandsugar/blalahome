package com.company;

class MyThreaddemo implements Runnable{
    private int ticket = 5;
    public void run(){
        for (int i=0; i<10; i++){
            synchronized (this){
                if(ticket>0){
                    try{
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("sale ticket: " + i);
                    ticket--;
                }
            }
        }
    }
};

public class MyThread {
  public static void main(String[] args){
      MyThreaddemo mt = new MyThreaddemo();
      Thread t1 = new Thread(mt);
      Thread t2 = new Thread(mt);
      Thread t3 = new Thread(mt);
      t1.start();
      t2.start();
      t3.start();
  }
}

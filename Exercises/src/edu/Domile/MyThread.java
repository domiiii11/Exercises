package edu.Domile;

public class MyThread extends Thread{

String name;

    public MyThread(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println("Hello rozallinda");
        displayName();
    }

    public static void displayName(){
        System.out.println(Thread.currentThread().getName());
    }


}

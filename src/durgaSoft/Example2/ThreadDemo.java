package durgaSoft.Example2;

import durgaSoft.Example1.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();//Thread initiation
        Thread thread=new Thread(myThread);
        thread.start();//start of a thread

        for(int i=0 ;i<10;i++){
            System.out.println("main thread");//executed by main thread
        }
    }
}

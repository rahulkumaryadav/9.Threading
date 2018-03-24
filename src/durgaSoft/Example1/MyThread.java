package durgaSoft.Example1;

/**
 * @Author :Rahul RP Yadav
 * Dated :2018-03-24
 * Defining a thread By extending Thread class
 */

public class MyThread extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child thread");//executed by child thread
        }
    }
}

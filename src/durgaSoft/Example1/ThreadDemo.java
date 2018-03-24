package durgaSoft.Example1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread=new MyThread();//Thread initiation
        thread.start();//start of a thread

        for(int i=0 ;i<10;i++){
            System.out.println("main thread");//executed by main thread
        }
    }
}

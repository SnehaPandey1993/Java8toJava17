package DataStructure.Thread;

public class ThreadRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Code executed by thread "+Thread.currentThread().getName());
    }
}
class ThreadRunMain{
    public static void main(String args[]){
        System.out.println("Going inside main method "+Thread.currentThread().getName());
        ThreadRun th=new ThreadRun();
        Thread t1=new Thread(th);
        t1.start();
        System.out.println("Finish the end "+Thread.currentThread().getName());
    }
}

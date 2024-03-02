package DataStructure.Thread;

public class ThreadThread extends Thread{
    @Override
    public void run(){
        System.out.println("Executed status "+Thread.currentThread().getName());
    }
}
class ThreadMain{
    public static void main(String args[]){
        System.out.println("Before "+Thread.currentThread().getName());
        ThreadThread Tthread=new ThreadThread();
        Tthread.start();
        System.out.println("after "+Thread.currentThread().getName());
    }
}

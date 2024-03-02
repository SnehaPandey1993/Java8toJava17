package DataStructure.Thread;

public class SynchronizedT1 {
    public synchronized void task1(){
        try {
            System.out.println("Task1");
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
    public void task2(){
        System.out.println("before synchronized");
        synchronized(this){
            System.out.println("inside Synchronized");
        }
    }
    public void task3(){
        System.out.println("task3");
    }
    public static void main(String args[]){
        SynchronizedT1 obj=new SynchronizedT1();
        Thread t1=new Thread(()->{obj.task1();});
        Thread t2=new Thread(()->{obj.task2();});
        Thread t3=new Thread(()->{obj.task3();});
        t1.start();t2.start();t3.start();
    }
}

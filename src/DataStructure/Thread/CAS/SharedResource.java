package DataStructure.Thread.CAS;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    int counter;
    AtomicInteger count=new AtomicInteger(1);
    AtomicBoolean bool=new AtomicBoolean(true);
    
    public void increment(){
        counter++;
    }
    public int get()
    {
        return counter;
    }
    public static void main(String args[]){
        SharedResource obj= new SharedResource();
        Thread t1=new Thread(()->{
            for (int i=1;i<200;i++){
                obj.increment();
            }
        });
        Thread t2=new Thread(()->{
            for (int i=1;i<200;i++){
                obj.increment();
            }
        });

        t1.start();
        t2.start();
        try {
         t1.join();
         t2.join();
        }catch (Exception e){

        }
        System.out.println(obj.get());
    }
}

package DataStructure.Thread;

import java.util.concurrent.*;

public class ThreadPoolExecutor1 {
    public static void main(String args[]){
        ThreadPoolExecutor threadpool= new ThreadPoolExecutor(2,5,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10),new customThreadFactory(),new customRejectionhandler());
        threadpool.allowCoreThreadTimeOut(true);
        for (int i=0;i<25;i++){
            threadpool.submit(()->{
                try {
                    Thread.sleep(5000);
                    System.out.println("Thread Name "+Thread.currentThread().getName());

                }catch (Exception e){

                }
            });
        }
        threadpool.shutdown();

    }
}
class  customThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread th=new Thread(r);
        return th;
    }
}
class customRejectionhandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task denied "+r.toString());
    }
}

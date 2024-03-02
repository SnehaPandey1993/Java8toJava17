package DataStructure.Thread.Consumer_Producer1;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {


    private Queue<Integer> sharedBuffer;
    private int bufferSize;
    public SharedResource(int bufferSize) {
        sharedBuffer=new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception {
        while (sharedBuffer.size()==bufferSize){
            System.out.println("buffer is full :producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("produce :  "+item);
        //notify consumer
        notify();
    }
    public synchronized int consume() throws Exception{
        while (sharedBuffer.isEmpty()){
            System.out.println("buffer ie empty , consumer is waiting for producer");
            wait();
        }
        int item=sharedBuffer.poll();
        System.out.println("Consumer "+item);
        //notify producer
        notify();
        return item;
    }

    public static void main(String args[]){
        SharedResource sharedResource=new SharedResource(3);
        Thread producer=new Thread(()->{
            try {
                for(int i=1;i<=6;i++){
                    sharedResource.produce(i);
                }
            }catch (Exception e){}
        } );
        Thread consumer=new Thread(()->{
            try {
                for (int i=1;i<=6;i++){
                    sharedResource.consume();
                }
            }catch (Exception e){

            }
        });
        producer.start();
        consumer.start();
    }

}

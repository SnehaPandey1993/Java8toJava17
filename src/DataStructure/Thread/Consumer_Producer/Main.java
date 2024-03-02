package DataStructure.Thread.Consumer_Producer;

public class Main {
    public static void main(String args[]){
        SharedResource sharedResource=new SharedResource();
        Thread consumer=new Thread(new ConsumerTask(sharedResource));
        Thread producer=new Thread(new ProducerTask(sharedResource));
        consumer.start();
        producer.start();
        System.out.println("Main method end");
    }
}

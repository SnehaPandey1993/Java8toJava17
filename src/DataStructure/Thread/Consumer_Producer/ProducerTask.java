package DataStructure.Thread.Consumer_Producer;

public class ProducerTask implements Runnable{

    SharedResource sharedResource;

    public ProducerTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer Thread : "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }catch (Exception e){}
        sharedResource.addItem();
    }
}

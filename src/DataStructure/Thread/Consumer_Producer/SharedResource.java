package DataStructure.Thread.Consumer_Producer;

public class SharedResource {
    boolean itemAvailable=false;
    //synchronized put the monitor lock
    public synchronized void addItem(){
        itemAvailable=true;
        System.out.println("Item added by: "+Thread.currentThread().getName()+" and invoking all the threads which is waiting");
        notifyAll();
    }
    public synchronized void consumeItem(){
        System.out.println("ConsumeItem method is invoked by: "+Thread.currentThread().getName());
        while (!itemAvailable){
            try {
                System.out.println("Thread "+Thread.currentThread().getName()+" is waiting now");
                wait();
            }catch (Exception e){}
        }
        System.out.println("Item consumed : "+Thread.currentThread().getName());
        itemAvailable=false;
    }
}

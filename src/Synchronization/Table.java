package Synchronization;

public class Table {
     void print(int m){
        for(int n=1;n<=5;n++){
            System.out.println("print before sleep:::  "+n*m);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


}
class mythread1 extends Thread{
    Table t;
    mythread1(Table t){
        this.t=t;
    }

    @Override
    public void run() {
        t.print(50);
    }
}

class  mythread2 extends Thread{
    Table t;
    mythread2(Table t){
        this.t=t;
    }

    @Override
    public void run() {
        t.print(200);
    }
}
class  sync{
    public  static void main(String... args){
        Table obj= new Table();
        mythread1 t1= new mythread1(obj);
        mythread2 t2= new mythread2(obj);
        Thread t3= new Thread(){
            @Override
            public void run() {
                obj.print(40);
            }
        };
        t1.start();
        t2.start();
        t3.start();
    }
}


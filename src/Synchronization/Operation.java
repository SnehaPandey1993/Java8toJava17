package Synchronization;

public class Operation {
    int data=50;
    void change(int data){
        data=data+50;
    }
    void change1(Operation op){
        op.data=op.data+100;
    }
    public static void main(String...args){
        Operation op= new Operation();
        System.out.println("before :::::"+op.data);
        int d=100;
       // op.change(d);
        op.change1(op);
        System.out.println("after :::::"+op.data);

        String s1="sneha";
        String s3="sneha";
        String s2= new String("sneha");
        if(s1 == s3)
        {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }
}

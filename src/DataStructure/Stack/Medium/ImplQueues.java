package DataStructure.Stack.Medium;

import java.util.*;

public class ImplQueues {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    public void remove(){
        if(q1.isEmpty()){
            return;
        }
        while (q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
        }
        q1.remove();

        //swap two queues
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }
    public void add(int a){

        q1.add(a);
    }
   public int top(){
        if(q1.isEmpty()){
            return 0;
        }
        while (q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
        }
        int temp=q1.peek();
        //swap
       Queue<Integer> q=q1;
       q1=q2;
       q2=q;
        return temp;
    }
    int size(){
        return q1.size();
    }
   public static void main(String args[]){
       ImplQueues stack= new ImplQueues();
       stack.add(21);
       stack.add(22);
       stack.add(23);
       stack.add(24);

           System.out.println("  TOP "+stack.top());
       System.out.println(" Size "+stack.size());
       stack.remove();
       System.out.println("  removed "+stack.top());

   }

}

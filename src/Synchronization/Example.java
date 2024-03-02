package Synchronization;

import org.junit.Test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Stack;

public class Example {


    Runnable r =()-> {  };

       int a= 5632;
    @Test
    public void test1(){
        int a=16;
           double c= squareRoot(a);
        System.out.println(c);
     //   fibb(a);
        /*String c="ABBCDDACDE";
        duplicates(c);
        System.out.println(prime(15));
        System.out.println(prime(9));*/

      //  String b="CDE";
    }

    public void fibb(int n)
    {
        int a=0 ,b=1;
        int c=0;

        while (c<=n)
        {
             c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
    public static double squareRoot(int num)
    {
//temporary variable
        double t;
        double sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }

    public boolean prime(int n) {
       int divident = n / 2;
        int start=2;
        int flag=0;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i <= divident; i++) {

                    if (n % i == 0) {
                        flag++;
                    }

            }
        }
        if(flag==0){
            return true;
        }else return false;
    }
    public String duplicates(String s){
        Stack<Character> ch=new Stack<>();
        for(int i=0;i<s.length();i++){
           if(!ch.isEmpty()&& ch.peek()==s.charAt(i)){
               ch.pop();
           }else {
               ch.push(s.charAt(i));
           }
        }
        s=ch.toString();
        System.out.println(s);
        return s;
    }


    public void sort(String c, String b) {
        StringBuilder bf = new StringBuilder();
        bf.append(b);
        int count = 0;
        for (int i = 0; i < c.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (c.charAt(i) == bf.charAt(j)) {

                }
            }
        }
    }
        @Test
        public void test2(){
            int z=50;
        }

       public int count(int a){
           String s=String.valueOf(a);
           int count=0;
           for (int i=0 ;i<s.length();i++){
               count++;
           }
           System.out.println(count);
           return count;
       }
    public int shape(int a, int b){
        int c= a+b;
        return c;
    }

    public int shape(int a, int b ,int d){
        int c= a+b+d;
        return c;
    }
}

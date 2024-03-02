package DataStructure.JP;

import java.util.Scanner;

public class newNumb {
    public static int func(String s,int n,int i){
        if(n<0){
            return 0;
        }else{
            int mid=(int)Math.pow(20,i);
            System.out.println(mid);
        int first=(s.charAt(n)-'a'+1)* mid;
        System.out.println(first);
       return first+func(s,n-1,i+1);}
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(func(s,s.length()-1,0));
    }
}

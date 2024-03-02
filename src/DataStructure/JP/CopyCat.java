package DataStructure.JP;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CopyCat {
    public static void main(String args[]){
      int[] nums=new int[]{1,2,3};
        permute(nums);
      /*  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] a=new String[n];
        for (int i=0;i<n;i++){
            a[i]=sc.next();
        }
        for (int i=0;i<n;i++){
            HashSet<String> hashSet=new HashSet<String>();
            String s=a[i];
            System.out.println("String "+s);
            permutation("",s,hashSet);
           // permutation(s,0,s.length(),hashSet);
            int max = 0;
            int k = 0;
            for (String str: hashSet) {
                System.out.println("str  "+str);
                k = maxDiff(str, s);
                max = Math.max(max, k);

            }
            System.out.println(max);
        }*/
    }

    private static int maxDiff(String str, String s) {
        int count=0;
        for (int i=0;i<s.length();i++){
            if(str.charAt(i)==s.charAt(i)){}else count++;
        }
        return count;
    }

    public static String swapString(String s,int start,int end){
        System.out.println("Sawp "+s+ "  start "+start+" end "+end);
        char[] ch=s.toCharArray();
        char temp;
        temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
        return String.valueOf(ch);
    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           ls.add(nums[0]);
           swapInt(nums);
        }
        System.out.println(list);
        return list;
    }

    private static void swapInt(int[] nums) {
    }

    public static void permutation(String str,String s,HashSet<String> hs){
        int n=s.length();

        if(n==0){
           hs.add(str);
        }else{
            for (int i=0;i<n ;i++){
                String a=str+s.charAt(i);
                String b=s.substring(0,i)+s.substring(i+1,n);
                permutation(a,b,hs);
            }
        }
    }
    public static void permutation(String s,int start,int end,HashSet<String> hs){
        if(start==end-1){
            hs.add(s);
        }else{
            for (int i=start;i<end;i++){
                s=swapString(s,start,i);
                System.out.println("Permu first "+s);
                permutation(s,start+1,end,hs);
                s=swapString(s,start,i);
                System.out.println("Permu second "+s);

            }
        }
    }
}

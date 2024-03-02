package DataStructure.JP;

import java.util.Scanner;

public class SettingArrange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            possibiliity(a[i]);
        }
    }

    private static void possibiliity(int n) {
        int c=0;
        String s="";
        for (int i=1;n!=c;i++){
            String a=Integer.toString(i,2);
          //  System.out.println(a);
            if(!a.contains("11")){
                c++;
                s=a;
            }
        }
        System.out.println(s);
    }
}

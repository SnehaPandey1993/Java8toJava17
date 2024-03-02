package DataStructure;

import org.junit.Test;

public class Prime {
    @Test
    public void test1(){
        int i=29;
        printp(i);
    }
    public void printp(int n){
        int count=0;
        for (int i=2;i<=n;i++){
            count=0;
            checkPrime(i,count);
        }

    }
    public static int checkPrime(int i,int count){
        for (int j=1 ;j<=i;j++){
            if(i%j==0){
                count+=1;
                if(j==i && count==2){

                    System.out.println("prime number");
                    System.out.print( i+" ");
                    int sum= sumThenum(i);
                    checkPrime(sum,count);
                    if(count>2){
                        System.out.println("good prime number");
                        System.out.print( i+" ");
                    }
                }
            }

        }
        return i;
    }

    private static int sumThenum(int i) {
        int temp=i;
        int sum=0;
        while (temp!=0){
            sum+=temp%10;
            temp=temp/10;
        }
        return sum;
    }
}

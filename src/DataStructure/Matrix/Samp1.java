package DataStructure.Matrix;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class Samp1 {

    @Test
    public void test1(){
        int a [] = {2,6,9,10,23,67,42,3};
        largestElemnebt(a);
    }

    @Test
    public void test2(){
       // int[][] a={};
       //  crossdimentions(4,4);
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiralPrint(4,4,a);
    }
    static void spiralPrint(int rowend, int colend, int a[][])
    {
        int i, rowstart = 0, colstart = 0;

        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
        int mn=Math.min(1,2);
        while (rowstart < rowend && colstart< colend) {
            // Print the first row from the remaining rows
            for (i = colstart; i < colend; ++i) {
                System.out.print(a[rowstart][i] + " ");
            }
            rowstart++;

            // Print the last column from the remaining
            // columns
            for (i = rowstart; i < rowend; ++i) {
                System.out.print(a[i][colend - 1] + " ");
            }
            colend--;

            // Print the last row from the remaining rows */
            if (rowstart < rowend) {
                for (i = colend - 1; i >= colstart; --i) {
                    System.out.print(a[rowend - 1][i] + " ");
                }
                rowend--;
            }

            // Print the first column from the remaining
            // columns */
            if (colstart < colend) {
                for (i = rowend - 1; i >= rowstart; --i) {
                    System.out.print(a[i][colstart] + " ");
                }
                colstart++;
            }
        }
    }
    public void crossdimentions(int rowl ,int columnl){
        int count=0;
        int row=0,col=0,i=0;
        int[][] a=new int[rowl][columnl];

        while (row<rowl && col<columnl){
                for (i = col; i <columnl; ++i) {
                    count += 1;
                    a[row][i]=count;
                    System.out.print(a[row][i]+" ");
                }
                row++;

                for (i=row;i<rowl;++i) {
                    count += 1;
                    a[i][columnl-1]=count;
                    System.out.print(a[i][columnl-1]+" ");
                }
                columnl--;
                if(col<rowl){
                    for (i=columnl;i>=row;--i){
                        count += 1;
                        a[rowl-1][i]=count;
                        System.out.print(a[rowl-1][i]+" ");
                    }
                    rowl--;
                }
            if (row < columnl) {
                for (i=rowl;i>=col;--i){
                    count += 1;
                    a[i][row]=count;
                    System.out.print(a[i][row]+" ");
                }
                row++;
            }
            }

            for (int j=0;j<rowl;j++){
                for (int k=0;k<columnl;k++){
                    System.out.print(a[j][k]+" ");
                    System.out.print("\n");
                }
            }

            }






    public int largestElemnebt(int[] a){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        Stack<Integer> st= new Stack<>();
        for (int i=0;i< a.length;i++){
            if(a[i]>largest && a[i]>secondlargest){
                largest=a[i];

            } else if (a[i]>secondlargest && a[i]< largest) {
                secondlargest =a[i];
            }

        }
        System.out.println(largest +" "+ secondlargest);
        return largest;
    }
}

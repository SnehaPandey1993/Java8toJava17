package DataStructure.Matrix;

import org.junit.Test;

import java.util.Arrays;

public class Rotate {
    @Test
    public void test1(){
        int[][] a={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12}};
        a=rotate(a);
    }
    public int[][] rotate(int[][] a){

        int row=0,col=0,rowend=a.length,colend=a[0].length;
        while (row < rowend && col < colend){
            if(row+1==rowend || col+1==colend){
                break;
            }
              int prev=a[row+1][col];
              for(int i=col;i<colend;i++)
              {
                  int curr=a[row][i];
                  a[row][i]=prev;
                  prev=curr;
              }
              row++;
            for(int i=row;i<rowend;i++)
            {
                int curr=a[i][colend-1];
                a[i][colend-1]=prev;
                prev=curr;
            }
            colend--;
            if(row<rowend){
                for (int i=colend-1;i>=col;i--){
                    int curr=a[rowend-1][i];
                    a[rowend-1][i]=prev;
                    prev=curr;
                }
            }
            rowend--;
            if(col<colend){
                for (int i=rowend-1;i>=row;i--){
                    int curr=a[i][col];
                    a[i][col]=prev;
                    prev=curr;
                }
            }
            col++;
        }
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");

        }
        return a;
    }
}

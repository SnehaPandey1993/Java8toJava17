package Pattern;

public class pattern1 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);

    }
    /*
     *****
     *****
     *****
     *****
     *****
     */

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

       /*

2.  *
    **
    ***
    ****
    *****

    */

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*

3.  *****
    ****
    ***
    **
    *

    */

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
    4.  1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        */
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    /*
     12345
5. 1 *         1 = row when row<n
   2 **        2 = row
   3 ***       3 = row
   4 ****      4 = row
   5 *****     5 = row
   6 ****      4 = 2*5 - 6 = 2*n -row when row>n
   7 ***       3
   8 **        2
   9 *         1

    */
    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalnoofcolinrow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalnoofcolinrow; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
 6.       *
         **
        ***
       ****
      *****

  */
    static void pattern6(int n) {
        int row = 0, col = 0;
        for (row = 0; row <= n; row++) {
            for (col = 2 * (n - row); col >= 0; col--) {
                System.out.print(" ");
            }


            for (col = 0; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
           01234
   7. 0  *****
       1  ****
        2  ***
          3 **
           4 *

           */
    static void pattern7(int n) {
        int row = 0, col = 0;
        for (row = 0; row < n; row++) {
            for (col = 0; col < row; col++) {
                System.out.print("  ");
            }
            //   col = 0;
            for (col = 0; col < n - row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
      0123456789
  8. 0     *    1(2*row-1) space=n-row
     1    ***   3
     2   *****  5
     3  ******* 7
     4 *********9

          */
    static void pattern8(int n) {
        int row = 0, col = 0;
        for (row = 1; row <= n; row++) {
            for (col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // col = 1;
            for (col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     9. ********* 9(2(n-row)-1) space= row
         *******  7
          *****   5
           ***    3
            *     1


            */
    static void pattern9(int n) {
        int row = 0, col = 0;
        for (row = 0; row < n; row++) {
            for (col = 0; col < row; col++) {
                System.out.print("  ");
            }
            //    col = 0;
            for (col = 0; col < (2 * (n - row) - 1); col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /* 10
        0     *        1=row  space= n-row
        1    * *
        2   * * *
        3  * * * *
        4 * * * * *
          012345678


            */
    static void pattern10(int n) {
        int row = 0, col = 0;
        for (row = 0; row < n; row++) {
            for (col = 0; col < n - row + 1; col++) {
                System.out.print(" ");
            }
            //    col = 0;
            for (col = 0; col < row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*         0123456789
    11. 0 * * * * *  *= n-row space= row
        1  * * * *
        2   * * *
        3    * *
        4     *     */
    static void pattern11(int n) {
        for (int row = 0; row < (n); row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < (n - row); col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }


    /* 12.

       1  * * * * *   totalnocolinrow= row >n? row-n : n-row;    row< n = n-row , row-n
       2   * * * *
       3    * * *       space = row >n ? row-totalnocolinrow : row  row < n  = row, n-totalnocolinrow
       4     * *
       5      *
       6      *
       7     * *
       8    * * *
       9   * * * *
      10  * * * * *
     */
    static void pattern12(int n) {
        for (int row = 0; row <= (2 * n); row++) {
            int c = row > n ? row - n : n - row;
            // int space = row >n ? row-totalnocolinrow : row;
            if (row < n) {
                for (int space = 0; space < row; space++) {
                    System.out.print(" ");
                }
            } else if (row > n) {
                for (int space = n - c; space > 0; space--) {
                    System.out.print(" ");
                }
            }
            for (int col = 0; col < c; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }

    /*
    13.       *          spaceOut= (n-row-1), spaceIn=(2*row-1)          2*1-1 , 2*2-1 , 2*3 -1
             * *          star = (n-row),(n-row)+spaceIn
            *   *
           *     *
          *********
    */
    static void pattern13(int n) {
        for (int row = 0; row < n; row++) {
            if (row < n - 1) {
                for (int col = 0; col < (n - 1 - row); col++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int col = 0; col < (2 * row - 1); col++) {
                    System.out.print(" ");
                }
                if (row != 0) {
                    System.out.print("*");
                }
            } else {
                for (int col = 0; col < (2 * (row + 1) - 1); col++) {
                    System.out.print("*");
                }
            }

            System.out.println();

        }
    }
}

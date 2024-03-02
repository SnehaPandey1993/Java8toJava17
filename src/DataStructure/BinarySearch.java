package DataStructure;

import org.junit.Test;

public class BinarySearch {
    @Test
    public void BinaryTest()
    {
        int[] arr={2, 3, 4, 10, 40};
        int target=10;

        int low=0,high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;

            if(arr[mid]==target){
                System.out.println(mid);
                break;

            }
            else if (arr[mid] < target) {
                low=mid;high=arr.length-1;

            } else {
              low=0;high=mid;
            }
        }

    }
}

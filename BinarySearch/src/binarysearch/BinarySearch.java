
package binarysearch;


public class BinarySearch {


    public static int search(int[] arr, int target) {
        int left = 0;
        int rigth = arr.length -1;
        
        while (left <= rigth) {
            int mid = (left + rigth) / 2;
            
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid;
            }else {
                rigth = mid -1;
            }
        }
        return -1;
    }

   
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,};
        
        int result = search(arr, 4);
        System.out.println(result);
        
     if (result>=0) {
         System.out.println("Found at index:" + result + "=" + arr [result]);
     } else {
         System.out.println(result);
     }
    }
}
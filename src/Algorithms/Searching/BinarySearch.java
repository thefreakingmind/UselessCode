package Algorithms.Searching;


/*
    Implementation of Binary Search Algorithm.
    Array to be Sorted.

    Problem(We Have N elements)

 */
public class BinarySearch {
    public boolean binarySearchIterative(int[] arr, int x, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = left + ((left + right) / 2);
        if (arr[mid] == x) {
            return true;
        } else if (arr[mid] > x) {
            return binarySearchIterative(arr, x, left, mid - 1);
        } else {
            return binarySearchIterative(arr, x, mid + 1, right);
        }
    }


    public int BinarySearchIterative(int[] arr, int x) {
        int l = 0;
        int r = arr.length -1;
        while (l <= r) {
            int mid = l + ((r-l) / 2);
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return  -1;
    }
    public boolean BinarySearchBoolean(int[] arr , int x){
        int l = 0;
        int r = arr.length;
        while(l<=r){
            int mid = l+((r-l)/2);
            if(arr[mid] == x){
                return true;
            }
            else if (arr[mid]< x){
                return false;
            }
            else
                return false;
        }
        return false;
    }


    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();
        int[] arr = {1,2,3,4,5,6};
        System.out.println(bs.binarySearchIterative(arr, 3, 1, 6));
        System.out.println(bs.BinarySearchIterative(arr, 4));
    }
}

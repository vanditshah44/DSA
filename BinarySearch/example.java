package BinarySearch;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        int start = 0;
        int arr[] = { 2, 3, 4, 5, 10, 15, 18, 20, 25, 27, 38, 42, 88 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Thing You Wanted to Find: ");
        int target = sc.nextInt();
        System.out.print(target + " Is found at This index: ");
        System.out.println(BinarySearch(arr, target, start));
        sc.close();

    }

    static int BinarySearch(int[] arr, int target, int start) {

        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

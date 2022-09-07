package BinarySearch.InterviewQuestions;

public class ceilingFlooringOfAnNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,14,16};
        int target = 12;
        System.out.println(ceilingFlooring(arr, target));
    }

    static int ceilingFlooring(int[] arr, int target) {
        // If my Target element is greater than the greatest element in the array 
        if (target > arr[arr.length -1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1; 
            } else {
                return mid;
            }
        }

        return start;
        // To find the Floor of the Numbers we just need to return the end because when the while loop condition break the Greatest Smallest Available number is the end 

    }
}

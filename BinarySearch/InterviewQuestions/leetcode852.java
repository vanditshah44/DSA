package BinarySearch.InterviewQuestions;
// https://leetcode.com/problems/find-peak-element/
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

// In leetcode the easy and the Medium question does have the same solution and here it is 
public class leetcode852 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,3,2};
        System.out.println(peakArray(arr));
    }
    static int peakArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start +(end-start) /2;
            if (arr[mid]> arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    } 
}

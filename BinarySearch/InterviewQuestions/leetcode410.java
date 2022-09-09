package BinarySearch.InterviewQuestions;

/**
 * leetcode410
 * https://leetcode.com/problems/split-array-largest-sum/
 * Asked in google 
 */
public class leetcode410 {
    public static void main(String[] args) {
        
    }
    
    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        // Binary Search 
        while (start <end) {
            int mid = start + (end - start) / 2;
            //  Calculate How many pieces You can Divide in with 
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if(sum  + num > mid) {
                    sum = num;
                    pieces++;

                }else {
                    sum += num;
                }


            }
            if (pieces > m) {
                start = mid + 1;

            } else {
                end = mid; 
            }
        }
        return end; // Return Any thing Start or end because Start == end;
    }
}
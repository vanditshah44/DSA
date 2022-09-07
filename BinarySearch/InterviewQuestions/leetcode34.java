package BinarySearch.InterviewQuestions;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class leetcode34 {
    public static void main(String[] args) {
        
    }

    static int[] search(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);
        
        ans[0] = start;
        ans[1] = end;

        return ans;
        
    }

     static int  search(int[] nums, int target, boolean isFirstIndex) {
        int start = 0;
        int end = nums.length -1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

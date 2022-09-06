package BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] arr = {100,98,66,55,44,34,23,12,6,5};
        int target = 66;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        boolean isAsc = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(isAsc) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else if (target < nums[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

            
        }
        return -1;

    }
}

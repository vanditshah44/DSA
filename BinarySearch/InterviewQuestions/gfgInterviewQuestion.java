package BinarySearch.InterviewQuestions;

/**
 * gfgInterviewQuestion
 */
public class gfgInterviewQuestion {

    public static void main(String[] args) {
        int[] arr = {13,14,15,16,18,2,3,6,12};
        System.out.println(findPivot(arr)+1);
    }
    
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            int mid = start + (end -start) / 2;

            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;

            }  if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
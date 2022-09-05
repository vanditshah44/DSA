package LinearSearch;

/**
 * minN
 */
public class minN {

    public static void main(String[] args) {
        int[] arr = {24,10,25,7,38,0,14};
        int ans = min(arr);
        System.out.println(ans);

    }
    public static int min(int arr[]) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                
            }

        }
        return min;


    }
}
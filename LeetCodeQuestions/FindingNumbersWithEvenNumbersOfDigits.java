package LeetCodeQuestions;

// Question 
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


public class FindingNumbersWithEvenNumbersOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }


        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        
    
        return numberOfDigits%2==0;
    }

    private static int digits(int num) {
        return (int) Math.log10(num) +1;
    }
}

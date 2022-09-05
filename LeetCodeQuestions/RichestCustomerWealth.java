package LeetCodeQuestions;
/*
 * Richest Customer Wealth Question 2
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {
            {1,5},
            {7,3},
            {3,5}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int count = 0;

        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            if (sum > count) {
                count = sum;
            }
        }


        return count;
    }
}

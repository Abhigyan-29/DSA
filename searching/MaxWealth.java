package searching;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        
    }
    public int maximumwealth(int[][] accounts){
        //person = row
        //accounts = columns
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            // when you start a new column , take a new sum for that row
            int sum =0;
            for (int account = 0; account < accounts[person].length ; account++) {
                sum+= accounts[person][account];

            }
            //now we have sum of accounts of person
            //check with overall answer
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

}

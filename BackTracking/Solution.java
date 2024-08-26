package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution ans = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = ans.subsets(nums);
        System.out.println(result);
    }

    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result, int start) {
        result.add(new ArrayList<>(current));  // Add the current subset to the result

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);               // Include nums[i] in the current subset
            backtrack(nums, current, result, i + 1); // Move on to the next element
            current.remove(current.size() - 1); // Backtrack to remove nums[i]
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result, 0);
        return result;
    }
}

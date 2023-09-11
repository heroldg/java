package test.TestLogiqueAlgo.TwoSum;

import java.util.HashMap;

public class LogiqueTwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        // Nested loop to compare every pair of numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No two elements add up to the target.");
    }

    public int[] twoSumV2(int[] nums, int target) {
        // Create a HashMap to store the elements and their indices
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (numMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { numMap.get(complement), i };
            }

            // Store the current element and its index in the HashMap
            numMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No two elements add up to the target.");
    }
}

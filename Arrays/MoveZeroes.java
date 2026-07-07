/*
LeetCode 283
Move Zeroes
Time : O(n)
Space : O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[current];
                nums[current] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }
}
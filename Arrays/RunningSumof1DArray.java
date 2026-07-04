/*
LeetCode 1480
Running Sum of 1D Array
Time : O(n)
Space : O(n)

An optimized solution is possible in O(1) extra space
by modifying the input array itself:
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int [] runningSum = new int [nums.length];
        for (int i=0;i<nums.length;i++){
            runningSum[i] = nums[i] + sum;
            sum += nums[i];
        }
        return runningSum;
    }
}
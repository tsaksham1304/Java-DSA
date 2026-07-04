/*
LeetCode 1295
Find Numbers with Even Number of Digits
Time : O(n x d) where d is the number of digits in the largest number
Space : O(1)
*/

class Solution {
    public int findNumbers(int[] nums) {
        int findNumbers=0;
        for (int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]>0){
                nums[i]/=10;
                count++;
            }
            if (count%2==0)
                findNumbers++;
        }
        return findNumbers;
    }
}
/*
LeetCode 1672
Richest Customer Wealth
Time : O(n)
Space : O(n)
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int i=0;i<accounts.length;i++){
            int wealth =0;
            for (int j=0;j<accounts[i].length;j++){
                wealth += accounts[i][j];
            }
            if (wealth > maximumWealth){
                maximumWealth = wealth;
            }
        }
        return maximumWealth;
    }
}
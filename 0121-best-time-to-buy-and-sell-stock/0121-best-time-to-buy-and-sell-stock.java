class Solution {
    public int maxProfit(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int profit = 0;

        for(int i =0; i<nums.length; i++){
            if(nums[i] < min){
                max = 0;
                min = nums[i];
            } else{
                max = Math.max(max, nums[i]);
                profit = Math.max(profit, max - min);
            }
            

        }
        return profit;
    }
}
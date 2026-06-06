class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        for(int num: nums) total += num;

        int LS = 0, RS = total;

        for(int i =0; i< nums.length;i++){
            RS = total - (nums[i] + LS);

            int currSum = Math.abs(LS - RS);
            LS += nums[i];
            nums[i] = currSum;
        }

        return nums;
        
    }
}
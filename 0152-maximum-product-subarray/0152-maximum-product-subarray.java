class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length; int front = 1; int back = 1; int max = Integer.MIN_VALUE;


        for(int i =0; i<n; i++)
        {
            if( front ==0) front =1;
            if( back ==0) back =1;

            front = nums[i] * front;
            back = nums[n-i-1] * back;
            max = Math.max(max,Math.max(front,back));
        }
        return max;
    }
}
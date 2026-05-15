class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        int prev = 1;
        next[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            next[i] = next[i + 1] * nums[i];
        }

          for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                next[i] = next[i + 1] * prev;
            } else {
                next[i] = prev;
            }
            prev = nums[i] * prev;
        }

        return next;
    }
}
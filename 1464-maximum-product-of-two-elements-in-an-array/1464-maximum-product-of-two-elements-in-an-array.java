// class Solution {
//     public int maxProduct(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int n = nums.length;

//         for(int i =0; i<n; i++){
//             for(int j = i+1; j<n; j++){
//                 max = Math.max((nums[i]-1)*(nums[j]-1), max);
//             }
//         }
//         return max;
//     }
// }

// Time - O(nlogn)
// class Solution {
//     public int maxProduct(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         Arrays.sort(nums);
//         int n = nums.length; 

//         max = ((nums[n-1] - 1) * (nums[n-2] - 1));
//         return max;
//     }
// }

class Solution { 
    public int maxProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return (firstMax - 1) * (secondMax - 1);
    }
} // time - O(n) space - O(1)
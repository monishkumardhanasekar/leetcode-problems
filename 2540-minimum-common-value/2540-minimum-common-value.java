class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int curr1 = 0;
        int curr2 = 0;

        while(curr1 != nums1.length && curr2 != nums2.length){
            if(nums1[curr1] == nums2[curr2]) return nums1[curr1];

            else if(nums2[curr2] > nums1[curr1]) curr1++;
            else curr2++;
        }

        return -1;
    }
}
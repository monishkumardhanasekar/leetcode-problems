class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int n = nums.length;
        int lessIndex = 0;
        int greaterIndex = n -1;
        int res[] = new int[n];

        for(int i =0, j = n-1; i < n; i++, j-- )
        {
            if(nums[i] < pivot)
            {
                res[lessIndex] = nums[i];
                lessIndex++;
            }

            if(nums[j] > pivot)
            {
                res[greaterIndex] = nums[j];
                greaterIndex--;
            }
        }

        // filling the pivot for the inbetwn index
        while(lessIndex <= greaterIndex)
        {
            res[lessIndex] = pivot;
            lessIndex++;
        }

        return res;
        
    }
}
class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int num: nums){
            min = Math.min(min, findSum(num));
        }
        return min;
        
    }

    public int findSum(int number){
        int sum = 0;

        while (number != 0) {
            sum += number % 10;  
            number /= 10;       
        }

        return sum;
    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int net = 0;

        for(int num: gain){
            net = net + num;
            max = Math.max(max, net);
        }

        return max;
        
    }
}
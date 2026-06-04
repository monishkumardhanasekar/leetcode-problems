class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for(int i = num1; i<= num2; i++){
            total += checkWaves(i);
        }

        return total;
    }

    public int checkWaves(int n){
        if(n <= 100) return 0;
        int waves = 0;
        String num = Integer.toString(n);
        
        for(int i = 1; i< num.length() - 1; i++){
            int prev = num.charAt(i-1) - '0';
            int curr = num.charAt(i) - '0';
            int next = num.charAt(i+1) - '0';

            if((curr < prev && curr < next) || (curr > prev && curr > next)) {
                waves++;
            }
        }

        return waves;
    }
}
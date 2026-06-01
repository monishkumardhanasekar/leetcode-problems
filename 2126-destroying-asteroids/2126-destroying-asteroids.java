class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long gain = mass;
        int n = asteroids.length;

        for(int i = 0; i<n; i++){
            if(asteroids[i] > gain) return false;
            gain += asteroids[i];
        }

        return true;

        
    }
}
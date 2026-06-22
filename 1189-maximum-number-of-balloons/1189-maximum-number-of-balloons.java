class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char t: text.toCharArray()){
            freq.put(t, freq.getOrDefault(t,0) + 1);
        }
        
        int min = Math.min( freq.getOrDefault('b', 0),Math.min(freq.getOrDefault('a', 0),
        Math.min(freq.getOrDefault('n', 0),Math.min( freq.getOrDefault('l', 0) / 2, freq.getOrDefault('o', 0) / 2))));

        return min;
        
    }
}
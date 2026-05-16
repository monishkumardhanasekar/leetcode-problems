class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int maxLength = 0;
        int left = 0, right = 0;
        Set<Character> seenChars = new HashSet<>();

        while (right < n) {
            if (!seenChars.contains(s.charAt(right))) {
                seenChars.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seenChars.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
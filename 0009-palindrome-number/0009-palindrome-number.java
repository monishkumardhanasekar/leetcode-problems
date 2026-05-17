// class Solution {
//     public boolean isPalindrome(int x) {
//         if (x < 0) return false;
//         if (x == 0) return true;

//         List<Integer> list = new ArrayList<>();

//         while (x != 0) {
//             list.add(x % 10);
//             x /= 10;
//         }

//         int left = 0;
//         int right = list.size() - 1;

//         while (left < right) {
//             if (!list.get(left).equals(list.get(right))) return false;
//             left++;
//             right--;
//         }

//         return true;
//     }
    
// }

class Solution {
    public boolean isPalindrome(int x) 
    {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        int originalNumber = x;

        while (x > 0) {
            int lastDigit = x % 10;
            revertedNumber = revertedNumber * 10 + lastDigit;
            x = x/10;
        }

        return originalNumber == revertedNumber;
    }
}
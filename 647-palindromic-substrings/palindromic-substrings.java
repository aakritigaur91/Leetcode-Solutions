class Solution {
    public int countSubstrings(String s) {
        boolean ans = false;
        int c = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                ans = isPalindrome(i, j, s);
                if(ans == true) c++;
            }
        }
        return c;
    }

    private boolean isPalindrome(int l, int r, String s) {
        while(l <= r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while(l <= r) {
            if(s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }
            else return isPalindrome(l + 1, r, s) || isPalindrome(l, r - 1, s);
        }
        return true;
    }

    private boolean isPalindrome(int l, int r, String str) {
        int n = str.length();
        while(l <= r) {
            if(str.charAt(l) != str.charAt(r)) {
                return false;
            }
            else {
                l++;
                r--;
            }
        }
        return true;
    }
}
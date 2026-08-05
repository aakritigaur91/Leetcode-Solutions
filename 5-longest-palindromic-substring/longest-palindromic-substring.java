class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(isPalindrome(i, j, s)) {
                    ans = s.substring(i, j + 1);
                    if(ans.length() > res.length())
                    res = ans;
                }
            }
        }
        return res;
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
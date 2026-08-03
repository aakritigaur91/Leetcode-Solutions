class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        int l = 0;
        int r = s1.length() - 1;
        while(l <= r) {
            if(s1.charAt(l) == s1.charAt(r)) {
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
}
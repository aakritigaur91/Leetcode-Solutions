class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int c = 0;
        if(s.length() == 1) {
            return false;
        }
        else {
            for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
                c++;
            }
            else if(c > 0 && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && !st.isEmpty()) {
                if(st.peek() == '(' && s.charAt(i) == ')') {
                    st.pop();
                }
                else if(st.peek() == '{' && s.charAt(i) == '}') {
                    st.pop();
                }
                else if(st.peek() == '[' && s.charAt(i) == ']') {
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return (st.isEmpty() && s.length()%2==0);
        }  
    }
}
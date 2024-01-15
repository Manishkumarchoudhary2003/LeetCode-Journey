import java.util.Stack;

public class decodeString {
    class Solution {
    public String decodeString(String s) {
        int n = s.length();
        Stack<String> st = new Stack<>();
        int number = 0;
        String curr = "";
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '['){
                st.push(curr);
                st.push(String.valueOf(number));
                number = 0;
                curr = "";
            } else if(c == ']'){
                int num = Integer.parseInt(st.pop());
                String ss = st.pop();
                curr = ss + curr.repeat(num);
            } else if(Character.isDigit(c)){
                int nn = (int)(c - '0');
                number = number * 10 + nn;
            } else {
                curr += c;
            }
        }
        return curr;
    }
}
}

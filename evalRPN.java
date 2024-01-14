import java.util.Stack;

public class evalRPN {
    class Solution {
        public int evalRPN(String[] tokens) {
            int n = tokens.length;
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (tokens[i].equals("+") && st.size() > 1) {
                    int a = st.pop();
                    int b = st.pop();
                    int sum = a + b;
                    st.push(sum);
                } else if (tokens[i].equals("-") && st.size() > 1) {
                    int a = st.pop();
                    int b = st.pop();
                    int diff = b - a;
                    st.push(diff);
                } else if (tokens[i].equals("*") && st.size() > 1) {
                    int a = st.pop();
                    int b = st.pop();
                    int mul = a * b;
                    st.push(mul);
                } else if (tokens[i].equals("/") && st.size() > 1) {
                    int a = st.pop();
                    int b = st.pop();
                    int div = b / a;
                    st.push(div);
                } else {
                    int num = Integer.parseInt(tokens[i]);
                    st.push(num);
                }
            }
            return st.peek();
        }
    }
    
}

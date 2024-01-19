import java.util.Stack;

public class removeDuplicates {
    class Solution {
        public String removeDuplicates(String s) {
    
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(st.size() > 0 && ch == st.peek()){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
            StringBuffer ss = new StringBuffer();
            while(st.size() > 0){
                char c = st.pop();
                ss.insert(0,c); 
            }
            return ss.toString(); 
            
        }
    }
}

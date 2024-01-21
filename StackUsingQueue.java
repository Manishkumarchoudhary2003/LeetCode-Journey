import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    class MyStack {

        Queue<Integer> q = new LinkedList<>();
    
        public MyStack() {
            
        }
        
        public void push(int x) {
            q.add(x);
            
        }
        
        public int pop() {
            int n = q.size();
            for(int i = 0; i < n-1; i++){
                q.add(q.remove());
            }
            int x = q.remove();
            return x;        
        }
        
        public int top() {
            int n = q.size();
            for(int i = 0; i < n-1; i++){
                q.add(q.remove());
            }
            int x = q.peek();
            q.add(q.remove());
            return x; 
            
        }
        
        public boolean empty() {
            if(q.size() == 0){
                return true;
            }else{
                return false;
            }
            
        }
    }
    
    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}

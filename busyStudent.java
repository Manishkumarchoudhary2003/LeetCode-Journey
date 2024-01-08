public class busyStudent {

    class Solution {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
    
            int max = 0;
    
            for(int i = 0; i < startTime.length; i++){
                if(queryTime >= startTime[i] && queryTime <= endTime[i]){
                    max++;
                }
            }
    
            return max;
            
        }
    }
    
}

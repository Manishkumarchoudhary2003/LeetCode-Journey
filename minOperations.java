import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {

        int result = 0;
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int element : nums) {
            frequency.put(element, frequency.getOrDefault(element, 0) + 1);
        }

         for (int freq : frequency.values()) {
            if(freq >= 2){
                 if(freq % 3 == 0){
                    result += (freq / 3);
                }else if(freq % 3 != 0){
                    result += (freq / 3) + 1;
                }
            }else{
                return -1;
            }
        }

        return result;
    }
}
import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
    
            Map<Character, Integer> mp = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                Character ch = s.charAt(i);
                if(!mp.containsKey(ch)){
                    mp.put(ch, 1);
                }else{
                    mp.put(ch, mp.get(ch) + 1);
                }
            }
            for(int i = 0; i < t.length(); i++){
                Character ch = t.charAt(i);
                if(!mp.containsKey(ch)) return false;
                mp.put(ch, mp.get(ch) - 1);
            }
            for(int i : mp.values()){
                if(i != 0) return false;
            }
            return true;
            
        }
    }
}

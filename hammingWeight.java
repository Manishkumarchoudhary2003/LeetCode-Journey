public class hammingWeight {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count=0;
            while(n!=0)
            {
                n = n & (n-1);
                count++;
            }
            return count;
            // int count = 0;
            // String s = Integer.toBinaryString(n);
            // for(int i = 0; i < s.length(); i++){
            //     if(s.charAt(i) == '1') count++;
            // }
    
            // return count;
        }
    }   
}

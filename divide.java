public class divide {
    class Solution {
        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == -1)
                return Integer.MAX_VALUE;
            if (dividend == Integer.MIN_VALUE && divisor == 1)
                return Integer.MIN_VALUE;
    
            long d = Math.abs((long)dividend);
            long dd = Math.abs((long)divisor);
    
            long result = 0;
            while (d >= dd) {
                long temp = dd, multiple = 1;
                while (d >= (temp << 1)) {
                    temp <<= 1;
                    multiple <<= 1;
                }
                d -= temp;
                result += multiple;
            }
    
            if ((dividend >= 0 && divisor >= 0) || (dividend <= 0 && divisor <= 0)) {
                return (int)result;
            } else {
                return (int)-result;
            }
        }
    }
    
}

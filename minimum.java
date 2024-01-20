import java.util.Arrays;

public class minimum {
//  You are given an array of integers nums of length n.
// The cost of an array is the value of its first element. For example, the cost of [1,2,3] is 1 while the cost of [3,4,1] is 3.
// You need to divide nums into 3 disjoint contiguous subarrays.
// Return the minimum possible sum of the cost of these subarrays.
// Input: nums = [10,3,1,1]
// Output: 12
// Explanation: The best possible way to form 3 subarrays is: [10,3], [1], and [1] at a total cost of 10 + 1 + 1 = 12.
// It can be shown that 12 is the minimum cost achievable.
class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums,1,nums.length);
        return nums[0] + nums[1] + nums[2];
        
    }
}
}

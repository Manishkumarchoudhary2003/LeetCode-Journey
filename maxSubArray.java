public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int curr = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max,curr);
        }

        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {
        // int sum = 0;
        // for (int j = i; j < n; j++) {
        // sum += nums[j];
        // max = Math.max(max, sum);
        // }

        // }

        return max;

    }
}

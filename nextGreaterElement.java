class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n];
        int p = 0;
        
        for(int i = 0; i < n; i++){
            int index = 0;
            for(int j = 0; i < m; j++){
                if(nums1[i] == nums2[j]){
                    index = j;
                    break;
                }
            }
            int count = 0;
            for(int k = index; k < m-1; k++){
                if(nums1[i] < nums2[k+1]){
                    arr[p++] = nums2[k+1];
                    count++;
                    break;
                }
            }
            if(count == 0){
                arr[p++] = -1;
            }
        }
        return arr;
        
    }
}
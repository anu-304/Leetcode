class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int i=0;
        int left=0;
        int right=n;
        while(left<n){
            res[i++]=nums[left++];
            
            res[i++]=nums[right++];
            
        }
        return res;
    }
}
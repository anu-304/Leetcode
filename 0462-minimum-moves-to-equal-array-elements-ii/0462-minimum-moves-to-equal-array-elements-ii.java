class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length /2];
        int c=0;
        for(int i:nums){
            c+=Math.abs(mid-i);
        }
        return c;
    }
}
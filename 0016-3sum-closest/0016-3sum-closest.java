class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int t=0, l=0,h=0,ans = 0;
        for(int i=0;i<n-2;i++){
            l=i+1;
            h=n-1;
            while(l < h){
                t = nums[i] + nums[l] + nums[h];
                if(Math.abs(target - t) < minDiff){
                    ans = t;
                    minDiff = Math.abs(target - t);
                } 
                else if(t==target){
                    return t;
                }
                else if(t>target){
                    h--;
                }
                else{
                    l++;
                }
            }
        }
        return ans;
    }
}
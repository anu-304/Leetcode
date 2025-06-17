class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        int minDiff= Integer.MAX_VALUE;
        int t=0;
        for(int i=0;i<n-2;i++){
            int low=i+1, high=n-1;
            while(low<high)
            {
                t=nums[i]+nums[low]+nums[high];
                if(Math.abs(target-t) < minDiff)
                {
                    ans=t;
                    minDiff= Math.abs(target-t);
                }
                if(t==target)
                    return t;
                else if(t>target)
                    high--;
                else
                    low++;
            }
        }
        return ans;
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(map.get(nums[i])>1)
            {
                ans=nums[i];
            }
        }
        return ans;
        
    }
}
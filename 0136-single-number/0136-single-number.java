class Solution {
    public int singleNumber(int[] nums) {
        
        //use extra space
        /*
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(1==m.get(nums[i]))
            {
                return (nums[i]);
            }
        }
        return -1; */
        
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans= ans^nums[i];
        }
        return ans;

    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /* two pointers not applicable
        int l=0;
        int r=nums.length-1;
        Arrays.sort(nums);
        while(l<=r)
        {
            if(nums[l]==nums[r] &&  Math.abs(l-r)<=k)
            {
                return true;
            }
            else if(nums[l]<nums[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return false; */

        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!s.add(nums[i]))
            {
                return true;
            }
            if(i>=k)
            {
                s.remove(nums[i-k]);
            }
        }
        return false;
    }
}
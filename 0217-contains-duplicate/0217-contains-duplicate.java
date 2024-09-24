class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>=2)
            {
                return true;
            }
        
        }
        return false;*/
        //most efficient
        /*Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        return s.size()<nums.length;  */

        Set<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            if(!s.add(i))
            {
                return true;
            }
        }
        return false;
    }
}
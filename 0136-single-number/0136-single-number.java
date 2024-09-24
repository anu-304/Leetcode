class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(1 == map.get(nums[i])) return nums[i];
        }
        return -1;
    }
}
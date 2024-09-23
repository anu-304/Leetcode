class Solution {
    public int findMin(int[] nums) {
        /*int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return min;*/
        
        /*Arrays.sort(nums);
        return nums[0];*/

        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}
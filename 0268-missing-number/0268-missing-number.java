class Solution {
    public int missingNumber(int[] nums) {
        /*int res=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            res=res + i-nums[i];   //add the diff b/t index and its corresponding value to res
        }
        return res; */
        int n= nums.length;
        int sum=(n*(n+1))/2;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
        }
        

        return sum-s;

    }
}
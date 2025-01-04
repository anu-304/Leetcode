class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long currsum=0;
        long totalsum=0;
        int c=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }

        for(int i=0;i<n-1;i++)
        {
            currsum+=nums[i];
            if(currsum>=totalsum-currsum){
                c++;
            }
        }
        return c;
    }
}

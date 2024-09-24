class Solution {
    public int maxSubArray(int[] nums) {   //Kadanes algorithm
        /*int m=Integer.MIN_VALUE;  //to store the minimum value
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
            if(s>m)
            {
                m=s;
            }
            if(s<0)   //use if not else if
            {
                s=0; //restart if sum becoms negative value
            }
        }
        return m;*/

        int sum=0;
        int s=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+ nums[i] ;
            if(sum>max)
            {
                max=sum;
            }
            while(sum<0)
            {
                sum=sum- nums[s];
                s++;
            }
        }
        return max;

    }
}// important problem
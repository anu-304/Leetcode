class Solution {
    public void moveZeroes(int[] nums) {
        /*int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];  
                k++;
            }
        }
        while(k<n)
        {
            nums[k]=0;
            k++;
        }*/
         //2 pointers

         int l=0,r=0;
         int t=0;
         for(int i=0;i<nums.length;i++)
         {
            if(nums[r]!=0)
            {
                t=nums[r];
                nums[r]=nums[l];
                nums[l]=t;
                l++;
            }
            r++;
         }
           

    }
}                 //the non zero element is stored and the pointer is increamented
                  // k pointer points a new array(imagine)
                  //O(n) -time complexity
                  //O(1) -space complextiy
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*int l=0;
        int[] arr=new int[2];
        int r=nums.length-1;
        int sum=0;
        //Arrays.sort(nums);
        while(l<r && l!=r)
        {
            sum=nums[l]+nums[r];
            if(sum==target)
            {
                arr[0]=l;
                arr[1]=r;
                break;
            }
            else if(sum<target)
            {
                l=l+1;
            }
            else if(sum>target)
            {
                r=r-1;
            }
        }
        return arr;*/
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int sum=nums[i]+nums[j];
                if(sum==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
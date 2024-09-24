class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];  //using another pointer to change in-place
                count++;
            }
        }
        return count;

        /*
        int k=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                arr[k++]=nums[i];
            }
        }
        //System.out.println(al);
        return k;*/ //wrong output
    }
}
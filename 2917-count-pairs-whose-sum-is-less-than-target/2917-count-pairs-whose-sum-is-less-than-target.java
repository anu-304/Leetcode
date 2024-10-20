class Solution {
    public int countPairs(List<Integer> nums, int target) {
       /* int count=0;
        for(int i=0;i<nums.size()-1;i++)
        {
            int sum=0;
            for(int j=i+1;j<nums.size();j++)
            {
                sum=nums.get(i)+nums.get(j);
                if(sum<target && i<j)
                {
                    count++;
                }
            }
        }
        return count;*/
        Collections.sort(nums);
        int l=0;
        int n=nums.size();
        int r=n-1;
        int count=0;
        while(l<r)
        {
            int sum=nums.get(l)+nums.get(r);
            if(sum<target)
            {
                count+=(r-l);
                l++;
            }
            else
            {
                r--;
            }
        }
        return count;    
    }
}
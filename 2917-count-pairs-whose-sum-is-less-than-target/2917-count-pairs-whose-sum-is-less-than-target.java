class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
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
        return count;

        
    }
}
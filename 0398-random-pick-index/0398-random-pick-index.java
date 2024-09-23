class Solution {
    private int nums[];
    private Random r =new Random();

    public Solution(int[] nums) {
        this.nums=nums; 
    }
    
    public int pick(int target) {
        int c=0;
        ArrayList<Integer> ar= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                c++;
                ar.add(i);
            }
        }
        int k= r.nextInt(c);
        return ar.get(k);

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
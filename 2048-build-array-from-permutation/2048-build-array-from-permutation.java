class Solution {
    public int[] buildArray(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[nums[i]]);
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=al.get(i);
        }
        return res;
    }
}
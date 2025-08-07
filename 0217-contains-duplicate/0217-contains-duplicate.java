class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int flag = 0;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i], m.getOrDefault(nums[i],0)+1);
        }
        for(int res: m.values()){
            if(res>1){
                flag = 1;
            }
        }
        if(flag==1) return true;
        return false;
    }
}
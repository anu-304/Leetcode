class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int even = 0;
        int odd =1;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(x % 2 == 0){
                arr[even] = nums[i];
                even=even+2;
            }
            else{
                arr[odd] = nums[i];
                odd=odd+2;
            }
        }
        return arr;
    }
}
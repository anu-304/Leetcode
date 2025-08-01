class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        int[] freq = new int[101];
        for(int num:nums){
            c+= freq[num];
            freq[num]++;
        }
        return c;
    }
}
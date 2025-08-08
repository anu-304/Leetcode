class Solution {
    private int[] nums;

    public void reverse(int i,int j){
        while(i<j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        this.nums = nums;
        int n = nums.length;
        k = k%n;

        reverse(0, n-1);
        reverse(0, k-1);
        reverse(k, n-1);

    }
}
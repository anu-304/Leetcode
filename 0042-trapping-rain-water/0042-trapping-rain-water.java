class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int trap=0;
        int l=0, left_max=height[0];
        int r=n-1, right_max=height[r];
        while(l<r){
            if(left_max<=right_max){
                trap+=(left_max-height[l]);
                l++;
                left_max=Math.max(left_max, height[l]);
            }
            else{
                trap+= (right_max-height[r]);
                r--;
                right_max = Math.max(right_max, height[r]);
            }

        }
        return trap;
    }
}
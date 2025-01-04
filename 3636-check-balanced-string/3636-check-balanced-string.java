class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0){
                even+=digit;

            }
            else{
                odd+=digit;
            }
        }
        return even==odd;
    }
}

class Solution {
    public String baseNeg2(int n) {
        if(n==0) return "0";
        StringBuilder res = new StringBuilder();
        while(n!=0){
            int remain = n % -2;
            n= n/-2;
            if(remain<0){
                remain= remain - (-2);
                n++;
            }
            res.append(remain);
        }
        return res.reverse().toString();
        
    }
}
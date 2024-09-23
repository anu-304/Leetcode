class Solution {
    public int addDigits(int n) {
       /* while(n>9)
        {
            int s=0;
            while(n>0)
            {
                s = s + n%10;
                n=n/10;
            }
            n=s;
        }
        return n;*/
        return 1+(n-1)%9;
    }
    
}
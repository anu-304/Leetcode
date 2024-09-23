class Solution {
    public String toHex(int num) {
       // return Integer.toHexString(num);
       if(num==0) 
       {
        return "0";
       }
       StringBuilder s = new StringBuilder();
       while(num!=0)
       {
        int last4 = num&15;
        if(last4<10)
        {
            s.append(last4);
        }
        else
        {
            s.append((char)(last4 - 10 +'a'));
        }
        num>>>=4;
       }
       return s.reverse().toString();

    }
}
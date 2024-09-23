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
        else  //for negative numbers
        {
            s.append((char)(last4 - 10 +'a'));
        }
        num=num>>>4;  //unsigned right shift
       }
       return s.reverse().toString();

    }
}
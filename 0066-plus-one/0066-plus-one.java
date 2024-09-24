class Solution {
    public int[] plusOne(int[] digits) {
        /*long num=0;
        for(int i=0;i<digits.length;i++)
        {
            num=num* 10 + digits[i];
        }
        num=num+1;
        String s=String.valueOf(num);
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i)-'0';
        }
        return (arr);*/    //only 77 testcase pass-->do not work for large number

        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;

    }
}
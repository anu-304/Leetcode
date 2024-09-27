class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder s=new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0 || carry==1)
        {
            if(i>=0)
            {
                carry=carry+ num1.charAt(i--) - '0';
            }
            if(j>=0)
            {
                carry=carry + num2.charAt(j--) - '0';
            }
            s.append(carry%10);
            carry=carry/10;
        }
        return s.reverse().toString();
    }
}
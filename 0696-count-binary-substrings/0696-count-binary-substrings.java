class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0;
        int prev=0,curr=1;
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==s.charAt(i-1))
            {
                curr++;
            }
            else
            {
                ans=ans+Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
        ans=ans+Math.min(prev,curr);
        return ans;
    }

}
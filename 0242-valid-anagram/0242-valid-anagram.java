class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int c=0;
        char[] ss=s.toCharArray();      
        char[] ts=t.toCharArray(); 
        Arrays.sort(ss);
        Arrays.sort(ts);
        for(int i=0;i<s.length();i++)
        {
            if(ss[i]!=ts[i])
            {
                break;
            }
            else{
            c++;
            }
        }
        if(c==s.length()) return true;
        else return false;
    }
}
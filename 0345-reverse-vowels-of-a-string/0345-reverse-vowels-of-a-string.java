class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','O','U'));
        int n=s.length();
        StringBuilder st=new StringBuilder(s);
        int l=0;
        int r=n-1;
        while(l<r)
        {
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(!set.contains(ch1) )
            {
                l++;
            }
            else if(!set.contains(ch2))
            {
                r--;
            }
            else if(set.contains(ch1) && set.contains(ch2))
            {
                st.setCharAt(l,ch2);
                st.setCharAt(r,ch1);
                l++;
                r--;
            }
        }
        return st.toString();
    }
}
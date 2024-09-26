class Solution {
    public int longestPalindrome(String s) {
        //convert to character array
        //set 
        
        Set<Character> a=new HashSet<>();
        int l=0;
        for(char ch:s.toCharArray())
        {
            if(a.contains(ch))
            {
                a.remove(ch);
                l+=2;  // 2 letters
            }
            else{
                a.add(ch);
            }
        
        }
        if(!a.isEmpty())
        {
            l+=1;
        }
        return l;
    }
}
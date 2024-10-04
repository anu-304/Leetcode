class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        /*int c=0;
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
        else return false;*/

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=t.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.getOrDefault(ch,0)-1);
            }
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}
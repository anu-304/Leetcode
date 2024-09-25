class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> m= new HashMap<>();
        String[] words=s.split(" ");
        if(words.length!=pattern.length())
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            if(m.containsKey(ch))
            {
                if(!m.get(ch).equals(words[i]))
                {
                    return false;
                }
            }
            else
            {
                if(m.containsValue(words[i]))
                {
                    return false;
                }
                m.put(ch,words[i]);
            }
        }
        return true;
    }
}
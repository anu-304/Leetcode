class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> m =new HashMap<>();
        char ch;
        for(int i=0;i<magazine.length();i++)
        {
            ch=magazine.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            ch=ransomNote.charAt(i);
            if(m.containsKey(ch) && m.get(ch)>0)
            {
                m.put(ch,m.get(ch)-1);
            }
            else{
                return false;
            }
        }
        return true;

    }
}
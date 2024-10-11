class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(map.get(ch)==1)
            {
                return i;
            }
        }
        return -1;
    }
}
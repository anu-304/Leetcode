class Solution {
    public char findTheDifference(String s, String t) {
        //converting string to character array
        //make their ascii sum individually
        //and subtract to get result
        //return character of result
        
        int ts=0,ss=0;
        for(char a:s.toCharArray())
        {
            ss = ss + (int)a;
        }
        for(char a:t.toCharArray())
        {
            ts = ts + (int)a;
        }
        return ((char)(ts-ss));

    }
}
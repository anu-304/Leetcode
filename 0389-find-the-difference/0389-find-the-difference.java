class Solution {
    public char findTheDifference(String s, String t) {
        //converting string to character array
        //make their ascii sum individually
        //and subtract to get result
        //return character of result
        int s_sum=0,t_sum=0;
        for(char a:s.toCharArray())
        {
            s_sum= s_sum+(int)a;
        }
        for(char a:t.toCharArray())
        {
            t_sum= t_sum+(int)a;
        }
        return (char)(t_sum-s_sum);

    }
}
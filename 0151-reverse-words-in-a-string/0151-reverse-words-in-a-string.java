class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        String st="";
        for(int i=words.length-1;i>=0;i--)
        {
            st+=words[i]+" ";
        }
        return st.strip();
    }
}
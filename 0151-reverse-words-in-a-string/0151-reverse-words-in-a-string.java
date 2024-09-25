class Solution {
    public String reverseWords(String s) {
        
        /*String st="";
        for(int i=words.length-1;i>=0;i--)
        {
            st+=words[i]+" ";
        }
        return st.strip(); */
        String[] words=s.trim().split("\\s+");
        List<String> a=new ArrayList<>();
        for(String z:words)
        {
            a.add(z);
        }
        Collections.reverse(a);
        String ans=String.join(" ",a);
        return ans;
    }
}
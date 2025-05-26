class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for(String a : words){
            int last = a.length() - 1;
            int pos = a.charAt(last) - '0';
            res[pos - 1] = a.substring(0,last);
        }
        return String.join(" ",res);
    }
}
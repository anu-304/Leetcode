class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String st:words){
            StringBuilder rev = new StringBuilder(st);
            rev.reverse();
            ans.append(rev).append(" ");
        }
        return ans.toString().trim();
    }
}
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        List<String> al = new ArrayList<>();
        for(String a:words){
            al.add(a);
        }
        Collections.reverse(al);
        String res = String.join(" ",al);
        return res;
    }
}
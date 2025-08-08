class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String total = s+s;
        if(total.contains(goal)) return true;
        return false;
    }
}
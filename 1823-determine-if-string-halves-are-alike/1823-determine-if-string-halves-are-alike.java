class Solution {
    public boolean halvesAreAlike(String s) {
        int l=s.length();
        int half = l/2;
        String a=s.substring(0,half);
        String b=s.substring(half);
        a=a.toLowerCase();
        b=b.toLowerCase();
        int ac=0,bc=0;
        for(char ch: a.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                ac++;
            }
        }
        for(char ch: b.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                bc++;
            }
        }
        if(ac==bc) return true;
        else return false;
    }
}
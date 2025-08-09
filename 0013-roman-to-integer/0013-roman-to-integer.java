class Solution {
    public int romanToInt(String s) {
        int[] r = new int[128];
        r['I'] = 1;
        r['V'] = 5;
        r['X'] = 10;
        r['L'] = 50;
        r['C'] = 100;
        r['D'] = 500;
        r['M'] = 1000;

        int last = s.length()-1;
        int ans = 0;

        for(int i=0;i<last;i++){
            if(r[s.charAt(i)] < r[s.charAt(i+1)]){
                ans -= r[s.charAt(i)];
            }
            else{
                ans += r[s.charAt(i)];
            }
        }
        return ans + r[s.charAt(last)];
    }
}
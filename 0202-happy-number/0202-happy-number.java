class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            n=func(n);
        }
        if(n==1) return true;
        return false;
    }

    public int func(int n){
        int rem=0,s=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            s=s+(rem*rem);
        }
        return s;
    }
}
class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder r=new StringBuilder();
        Boolean negative = num < 0;
        num=Math.abs(num);
        while(num!=0){
            r.append(num%7);
            num=num/7;
        }
        if(negative){
            r.append('-');
        }
        return r.reverse().toString();
    }
}
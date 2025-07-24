class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        int n = rowIndex+1;
        long ans = 1;
        al.add((int)ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            al.add((int)ans);
        }
        return al;

    }
}
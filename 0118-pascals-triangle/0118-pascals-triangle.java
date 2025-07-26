class Solution {

    public static List<Integer> generateRow(int n){
        List<Integer> temp = new ArrayList<>();
        long ans=1;
        temp.add(1);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            temp.add((int)ans);
        }
        return temp;
    }

    

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}
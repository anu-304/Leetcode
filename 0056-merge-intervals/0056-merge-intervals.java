class Solution {
    public int[][] merge(int[][] intervals) {
        int l = intervals.length;
        if(l==0){
            return new int[0][0];
        }
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1;i<l;i++){
            int[] last = res.get(res.size()-1);
            if(last[1]>=intervals[i][0]){
                last[1] = Math.max(last[1], intervals[i][1]);
            }
            else{
                res.add(intervals[i]);
            }

        }
        return res.toArray(new int[res.size()][]);
    }
}
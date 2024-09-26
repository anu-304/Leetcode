class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            s.add(i);
        }        
        ArrayList<Integer> al=new ArrayList<>(s);
        Collections.sort(al);
        int n=al.size();
        if(n<3)
        {
            return al.get(n-1);
        }
        
        return al.get(n-3);
        
    }
}
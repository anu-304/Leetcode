class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            s.add(i);
        }    
        for(int i=1;i<=nums.length;i++)
        {
            if(!s.contains(i))
            {
                al.add(i);
            }
        }
        return al;
        
    }
}
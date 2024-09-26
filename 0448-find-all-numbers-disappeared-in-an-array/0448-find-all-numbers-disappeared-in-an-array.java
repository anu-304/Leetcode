class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            s.add(i);
        }    
        for(int i=1;i<=nums.length;i++)  //iterate till n
        {
            if(!s.contains(i)) //if the element is not in set ,add to arraylist
            {
                al.add(i);
            }
        }
        return al;
        
    }
}
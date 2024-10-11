class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al=new ArrayList<>();
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            int find=candies[i]+extraCandies;
            if(find>=max)
            {
                al.add(true);
            }
            else{
                al.add(false);
            }
        }
        return al;
    }
}
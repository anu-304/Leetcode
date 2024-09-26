class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int k=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    al.add(nums1[i]);
                    k++;
                    nums2[j]=Integer.MIN_VALUE; // Mark as used to avoid duplicates
                    break;
                }
            }
        }
        int[] res=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            res[i]=al.get(i);
        }
        return res;
    }
}
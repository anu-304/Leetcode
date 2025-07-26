class Solution {
    public void nextPermutation(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int num:nums){
            al.add(num);
        }

        int idx = -1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(al.get(i)<al.get(i+1)){
                idx=i;
                break;
            }
        }

        if(idx == -1){
            Collections.reverse(al);
            for(int i=0;i<n;i++){
                nums[i]=al.get(i);
            }
            return;
        }
        int t=0;
        for(int i=n-1;i>=0;i--){
            if(al.get(i)>al.get(idx)){
                t=al.get(i);
                al.set(i,al.get(idx));
                al.set(idx,t);
                break;
            }
        }
        List<Integer> sub = al.subList(idx+1,n);
        Collections.reverse(sub);

        for(int i=0;i<n;i++){
            nums[i]=al.get(i);
        }
    }
}
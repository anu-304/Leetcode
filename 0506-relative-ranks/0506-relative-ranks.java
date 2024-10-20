class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[] sor=score.clone();
        Arrays.sort(sor);
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            int tar=n - binsearch(sor,score[i]);
            if(tar==1)
            {
                arr[i]="Gold Medal";
            }
            else if(tar==2)
            {
                arr[i]="Silver Medal";
            }
            else if(tar==3)
            {
                arr[i]="Bronze Medal";
            }
            else
            {
                arr[i]=String.valueOf(tar);
            }
        }
        return arr;
    }
    public static int binsearch(int[] arr,int target)
    {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if (arr[mid]<target)
            {
                left=mid +1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}
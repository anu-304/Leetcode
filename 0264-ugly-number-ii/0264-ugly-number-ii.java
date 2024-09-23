class Solution {
    public int nthUglyNumber(int n) {
        /*ArrayList<Integer> al= new ArrayList<>();
        int count=0;
        int i=1;
        while(count<n)
        {
            if(isUgly(i))
            {
                al.add(i);
                count++;
            }
            i++;
        }
        return al.get(n-1);*/
        int[] arr=new int[n];
        arr[0]=1;
        int i2=0,i3=0,i5=0;
        int next2=2,next3=3,next5=5;
        for(int i=1;i<n;i++)
        {
            int min=Math.min(next5,Math.min(next2,next3));
            arr[i]=min;
            if(min==next2)
            {
                i2++;
                next2=arr[i2]*2;
            }
            if(min==next3)
            {
                i3++;
                next3=arr[i3]*3;
            }
            if(min==next5)
            {
                i5++;
                next5=arr[i5]*5;
            }
        }
        return (arr[n-1]);
    }
    /*
    public boolean isUgly(int i)
    {
        while(i%5==0 || i%3==0 || i%2==0)
        {
            if(i%5==0)
            {
                i=i/5;
            }
            if(i%3==0)
            {
                i=i/3;
            }
            if(i%2==0)
            {
                i=i/2;
            }
        }
        return i==1;
    }*/ //time limit exceeded error
}
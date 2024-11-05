class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1)
        {
            return 1;
        }
        int[] indegree=new int[n+1];
        int[] outdegree=new int[n+1];

        for(int i=0;i<trust.length;i++)
        {
            int a=trust[i][0];
            int b=trust[i][1];
            indegree[b]++;
            outdegree[a]++;
        }
        int ans=-1;
        for(int i=0;i<n+1;i++)
        {
            if(indegree[i]==n-1 && outdegree[i]==0)
            {
                    ans=i;
            }
        }
        return ans;

    }
}
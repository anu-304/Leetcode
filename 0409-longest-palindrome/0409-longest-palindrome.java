class Solution {
    public int longestPalindrome(String s) {
        //convert to character array
        //set 
        /*
        Set<Character> a=new HashSet<>();
        int l=0;
        for(char ch:s.toCharArray())
        {
            if(a.contains(ch))
            {
                a.remove(ch);
                l+=2;  // 2 letters
            }
            else{
                a.add(ch);
            }
        
        }
        if(!a.isEmpty())
        {
            l+=1;
        }
        return l; */
        int[] arr =new int[52];
        for(char ch:s.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                arr[ch-'A']++;
            }
            else
            {
                arr[ch-'a'+26]++;
            }
        }
        int count=0;
        int odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count=count+arr[i];
            }

            else if(arr[i]%2==1 && arr[i]!=1)
            {
                count= count+arr[i]-1;
                odd=1;
            }
            else if(arr[i]%2==1 && arr[i]==1)
            {
                odd=1;
            }
        }
        return count+odd;
    }
}
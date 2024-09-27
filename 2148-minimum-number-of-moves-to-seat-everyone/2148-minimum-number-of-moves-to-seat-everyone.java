class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int min=Integer.MAX_VALUE;
        int diff=0;
        int n=seats.length;
        for(int i=0;i<n;i++)
        {
            diff+=Math.abs(seats[i]-students[i]);
            
        }
        return diff;
        
    }
}
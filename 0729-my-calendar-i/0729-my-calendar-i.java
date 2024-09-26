class MyCalendar {
    
    private ArrayList<int[]> al;
    public MyCalendar() {
    al=new ArrayList<>();

    }
    
    public boolean book(int start, int end) {
        for(int[] event:al)
        {
            int s=event[0];
            int e=event[1];
            if(start<e && end>s)
            {
                return false;
            }
        }
        al.add(new int[]{start,end});
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
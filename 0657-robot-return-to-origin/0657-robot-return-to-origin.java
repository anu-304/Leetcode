class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0,y=0;
        for(char ch:moves.toCharArray()){
            switch(ch){
                case 'U':
                    x = x + 1;
                    break;
                case 'D':
                    x = x - 1;
                    break;
                case 'L':
                    y = y + 1;
                    break;
                case 'R':
                    y = y - 1;
                    break;
            }
        }
        if(x == 0 && y==0) return true;
        else return false;
    }
}
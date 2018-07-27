class Solution {
    public boolean judgeCircle(String moves) {
        int x =0;
        int y =0;
        char[] arr = moves.toCharArray();
        for(int i=0;i<arr.length;i++){
            switch(arr[i]){
                case 'U': y++;
                    break;
                case 'D':y--;
                    break;
                case 'L':x--;
                    break;
                case 'R':x++;
                    break;
                default: return false;
            }
        }
        return x==0 && y==0;
        
    }
}
class Solution {
    public int compress(char[] chars) {
        int count=0;
        int prev = 0;
        for(int i=0;i<chars.length;i++){
            count++;
            if(i+1>=chars.length||chars[i+1]!=chars[i]){
                if(count>1){
                    chars[prev]=chars[i];
                    prev=prev+1;
                    if(count<9){
                        chars[prev]=(char)(count+48);
                        prev=prev+1;
                    }
                    else{
                        Stack<Integer> s =new Stack<>();
                        while(count!=0){
                            int d= count%10;
                            s.push(d);
                            count=count/10;
                        }
                        while(!s.isEmpty()){
                            chars[prev++]=(char)(s.pop()+48);
                        }
                        
                    }
                    count = 0;
                }
                else{
                    chars[prev]=chars[i];
                    prev=prev+1;
                    count = 0;
                }
            }
        }
        return prev;
    }
}
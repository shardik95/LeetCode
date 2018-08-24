class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        int flag=0;
        for(int i:asteroids){
            collison: if(stk.isEmpty())
                stk.push(i);
            else if(stk.peek()>0 && i>0)
                stk.push(i);
            else if(stk.peek()<0 && i<0)
                stk.push(i);
            else if (i>0 && stk.peek()<0)
                stk.push(i);
            else {
                 while(!stk.isEmpty() && (i<0 && stk.peek()>0)){
                    int x = stk.pop();
                    int y = i;
                    if(Math.abs(x)==Math.abs(y))
                        break collison;
                    if(Math.abs(x)>Math.abs(y)){
                            i=x;
                        }
                        else if(Math.abs(y)>Math.abs(x)){
                            i=y;
                        }
                }
                stk.push(i);
            }
        }
        return stk.stream().mapToInt(i->i).toArray();
    }
}
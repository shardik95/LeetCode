class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> stk = new Stack<Integer>();
        int i=1;
        String[] s = logs.get(0).split("\\:");
        stk.push(Integer.parseInt(s[0]));
        int prev = Integer.parseInt(s[2]);
        int res[] = new int[n];
        while(i<logs.size()){
            s = logs.get(i).split("\\:");
            if(s[1].equals("start")){
                if(!stk.isEmpty())
                    res[stk.peek()] += Integer.parseInt(s[2]) - prev;
                stk.push(Integer.parseInt(s[0]));
                prev = Integer.parseInt(s[2]);
            }
            else{
                if(!stk.isEmpty())
                    res[stk.peek()] += Integer.parseInt(s[2]) - prev + 1;
                stk.pop();
                prev = Integer.parseInt(s[2]) + 1;
            }
            i++;
        }
        return res;
    }
}
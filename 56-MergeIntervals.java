class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>() {
            public int compare(Interval i1,Interval i2){
                return i1.start-i2.start;
            }
        });
        LinkedList<Interval> ans = new LinkedList<>();
        for(Interval i:intervals){
            if(ans.isEmpty() || ans.getLast().end<i.start)
                ans.add(i);
            else{
                ans.getLast().end = Math.max(ans.getLast().end,i.end);
            }
        }
        
       return ans;
    }
}
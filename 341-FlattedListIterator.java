/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    List<NestedInteger> nestedList;
    List<Integer> list = new ArrayList<>();
    Iterator<Integer> itr;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        for(NestedInteger n:nestedList)
            getFlatList(n);
        itr = list.iterator();
    }

    @Override
    public Integer next() {
        return itr.next();   
    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }
    
    private void getFlatList(NestedInteger nestedInteger){
        if(nestedInteger.isInteger())
            list.add(nestedInteger.getInteger());
        else{
            for(NestedInteger n:nestedInteger.getList()){
                getFlatList(n);
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
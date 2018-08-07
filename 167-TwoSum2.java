class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int compli = target - numbers[i];
            int k = Arrays.binarySearch(numbers,compli);
            if(k>=0){
                if(i<k) 
                    return new int[]{i+1,k+1};
                else if(k>i) return new int[]{k+1,i+1};
                else if(i+2<numbers.length-1) return new int[]{i+1,i+2};
                else return new int[]{k+1,k+2};
            }
        }
        return new int[2];
    }
}
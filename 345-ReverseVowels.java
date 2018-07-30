class Solution {
    public String reverseVowels(String s) {
        if(s.length()==0||s.length()==1)
            return s;
        
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(set.contains(arr[start]) && set.contains(arr[end]) ){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if (set.contains(arr[start]) && !set.contains(arr[end])){
                end--;
            }
            else if (!set.contains(arr[start]) && set.contains(arr[end])){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}
class Solution {
    public int firstUniqChar(String s) {
        int[] array = new int[26];
        for(int i=0;i<s.length();i++){
            int no = s.charAt(i)-'a';
            array[no] = array[no] + 1;
        }
        for(int i=0;i<s.length();i++){
            int no = s.charAt(i)-'a';
            if(array[no]==1)
                return i;
        }
        return -1;
    }
}
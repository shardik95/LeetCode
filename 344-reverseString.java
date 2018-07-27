class Solution {
    public String reverseString(String s) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++)
            arr[i]=s.charAt(s.length()-1-i);
        return new String(arr);
    }
}
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length && arr[i+1]==' '){
                end = i;
                String temp = reverse(arr,start,end);
                sb.append(temp);
                sb.append(" ");
                start = i+1;
            }
            else if(i==arr.length-1){ 
                end = arr.length-1;
                String temp = reverse(arr,start,end);
                sb.append(temp);
            }
        }
        return sb.toString();
    }
    
    private String reverse(char arr[], int i, int k){
        int start = i;
        int end = k;
         if(arr[i]==' ')
            i=i+1;
        char[] c = new char[k-i+1];
        int d = 0;
        while(i<=k){
            c[d] = arr[k];
            k --;
            d++;
        }
        return new String(c);
    }
}
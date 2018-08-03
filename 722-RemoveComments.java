class Solution {
    public List<String> removeComments(String[] source) {
        
        boolean inBlock = false;
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String line:source){
            if(!inBlock)
                sb = new StringBuilder();
            char[] arr = line.toCharArray();
            int i=0;
            while(i<arr.length){
                if(!inBlock && i+1<arr.length && arr[i]=='/' && arr[i+1]=='*'){
                    inBlock = true;
                    i++;
                } else if (inBlock && i+1<arr.length && arr[i]=='*' && arr[i+1]=='/' ){
                    inBlock = false;
                    i++;
                } else if(!inBlock && i+1<arr.length && arr[i]=='/' && arr[i+1]=='/')
                    break;
                else if(!inBlock){
                    sb.append(arr[i]);
                }
                i++;
            }
            if(!inBlock && sb.length()>0)
                ans.add(sb.toString());
        }
        return ans;
    }
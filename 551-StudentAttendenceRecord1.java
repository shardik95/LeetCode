class Solution {
    public boolean checkRecord(String s) {
        
        if(s.length()==0 || s==null)
            return true;
        
        char[] arr = s.toCharArray();
        int Acount=0;
        char prev = 'z';
        int Lcount = 0;
        for(int i=0;i<arr.length;i++){
            char x = arr[i];
            switch(x){
                case 'P':prev = x;
                    break;
                case 'A':Acount++;
                    if(Acount>1)
                        return false;
                    prev = 'A';
                    break;
                case 'L':if(prev!='L'){
                    Lcount=1;
                    prev ='L';
                }
                    else{
                        Lcount++;
                        if(Lcount>2)
                            return false;
                        prev = 'L';
                    }
                    break;
            }
        }
        return true;
    }
}
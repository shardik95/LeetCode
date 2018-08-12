class Solution {
    public String convert(String s, int numRows) {
        
        if(s==null||s.equals(""))
            return "";
        if(numRows==1)
            return s;
        StringBuilder sb1= new StringBuilder();
        if(numRows==2){
            for(int i=0;i<s.length();i=i+2)
                sb1.append(""+s.charAt(i));
            for(int i=1;i<s.length();i=i+2)
                sb1.append(""+s.charAt(i));
            return sb1.toString();
        }
        
        int n = numRows;
        int x = n-2;
        boolean flag = false;
        int y = 0;
        
        ArrayList<String>[] zigzag = new ArrayList[n];
        
        for(int i=0;i<s.length();i++){
            if(flag==false){
                //System.out.println(y+"-");
                if(zigzag[y%n]==null){
                    zigzag[y%n]= new ArrayList<String>();
                }
                //System.out.println(zigzag[y%n]+"-");
                ArrayList<String> temp = zigzag[y%n];
                temp.add(temp.size(),""+s.charAt(i));
                zigzag[y%n] = temp;
                y++;
                if((y%n)==0){
                    flag = true;
                    x = n-2;
                }
                
            }
            else{
                if(x>0 && i<s.length()){
                    ArrayList<String> temp = zigzag[x];
                    temp.add(temp.size(),""+s.charAt(i));
                    zigzag[x] = temp;
                    x--;
                    
                }
                if(x==0){
                    flag=false;
                    y=0;
                }
                //System.out.println(zigzag[x]+"-");
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<zigzag.length;i++){
            if(zigzag[i]!=null){
                String t[]= (zigzag[i].toArray(new String[zigzag[i].size()]));
                for(String s1:t)
                    sb.append(s1);
            }
        }
        return sb.toString(); 
    }
}
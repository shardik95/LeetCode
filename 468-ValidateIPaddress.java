class Solution {
    public String validIPAddress(String IP) {
        if(IP.contains(".")){
            if(IP.charAt(IP.length()-1)=='.')
                return "Neither";
            String arr[] = IP.split("\\.");
            if(arr.length!=4)
                return "Neither";
            int flag = 0;
            for(String s:arr){
                
                if(s.length()==0)
                    return "Neither";
                if(s.charAt(0)=='0'&&s.length()>1)
                    return "Neither";
                if(s.charAt(0)=='-')
                    return "Neither";
                try{
                int no = Integer.parseInt(s);
                if(no>=0&&no<=255)
                    flag =1;
                else
                    return "Neither";
                }
                catch(Exception e){
                    return "Neither";
                }
            }
            if(flag==1)
                return "IPv4";
        }
        else if(IP.contains(":")){
            String ip6[] = IP.split("\\:");
            //int flag1=0;
            if(IP.charAt(IP.length()-1)==':')
                return "Neither";
            if(ip6.length!=8)
                return "Neither";
            for(String s:ip6){
                if(s.length()==0)
                    return "Neither";
                if(s.length()>4)
                    return "Neither"; 
                for(char c:s.toCharArray()) {
                    boolean isDigit = c>=48 && c<=57;
                    boolean isUppercaseAF = c>=65 && c<=70;
                    boolean isLowerCaseAF = c>=97 && c<=102;
                    if(!(isDigit || isUppercaseAF || isLowerCaseAF)) 
                        return "Neither";
	            }
            }
            return "IPv6";
        }
        else return "Neither";
        
        return "Neither";
    }
}
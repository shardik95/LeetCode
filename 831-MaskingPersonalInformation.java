class Solution {
    public String maskPII(String S) {
        if(S.indexOf("@")>=0){
            S = S.toLowerCase();
            int index = S.indexOf("@");
            StringBuilder sb = new StringBuilder();
            String maskedName = S.substring(0,index);
            sb.append(maskedName.charAt(0));
            sb.append("*****");
            sb.append(maskedName.charAt(maskedName.length()-1));
            sb.append(S.substring(index));
            return sb.toString();
        }
        else{
            String[] sign = {"+", "-", "(", ")"," "};
            for(String signString:sign){
                if(S.contains(signString)){
                     S=S.replaceAll("\\"+signString,"");
                }
            }
            if(S.length()%10>0){
                int n = S.length()%10;
                S=S.substring(n,S.length());
                String last = S.substring(S.length()-4,S.length());
                StringBuilder sb = new StringBuilder();
                sb.append("+");
                while(n>0){
                    sb.append("*");
                    n--;
                }
                sb.append("-***-***-");
                sb.append(last);
                return sb.toString();
            }
            else{
                String last = S.substring(S.length()-4,S.length());
                StringBuilder sb = new StringBuilder();
                sb.append("***-***-");
                sb.append(last);
                return sb.toString();
            }
            
        }
    }
}
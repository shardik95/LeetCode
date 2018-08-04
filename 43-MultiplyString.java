import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.multiply(n2).toString();
    }
    
    String convertStringToNumber(String n){
        if(n.length()==1 && n.charAt(0)=='0')
            return "0";
        int i=0;
        int j=n.length()-1;
        int ans = 1;
        while(j>=0){
            ans += (n.charAt(j)-48)*Math.pow(10,i);
            i++;
            j--;
        }
        return ""+(ans-1);
    }
}
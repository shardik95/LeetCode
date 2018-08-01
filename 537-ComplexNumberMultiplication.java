class Solution {
    public String complexNumberMultiply(String a, String b) {
        String a_split[] = a.split("\\+");
        String b_split[] = b.split("\\+");
        
        String[] real={a_split[0],b_split[0]};
        String[] complex = {a_split[1].split("i")[0],b_split[1].split("i")[0]};
        
        int ans_real = Integer.parseInt(a_split[0])*Integer.parseInt(b_split[0])
                        - Integer.parseInt(complex[0])*Integer.parseInt(complex[1]);
        int ans_complex = Integer.parseInt(a_split[0])*Integer.parseInt(complex[1])
            + Integer.parseInt(b_split[0])*Integer.parseInt(complex[0]);
        
        return ""+ans_real+"+"+ans_complex+"i";
        
    }
}
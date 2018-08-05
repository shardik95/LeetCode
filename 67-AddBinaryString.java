class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int car = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0){
            int val = 0;
            if(i>=0){
                val += (a.charAt(i)-48);
                i--;
            }
            if(j>=0){
                val += (b.charAt(j)-48);
                j--;
            }
            val += car;
            if(val>=2)
                car = 1;
            else{
                car = 0;
            }
            sb.insert(0,val%2);
        }
        if(car!=0)
            sb.insert(0,car);
        return sb.toString();
    }
}
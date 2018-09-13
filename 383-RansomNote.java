class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.equals(magazine))
            return true;
        
        if(magazine==null || magazine.length()==0)
            return false;
        
        int[] mag = new int[26];
        for(int i=0;i<magazine.length();i++){
            char x = magazine.charAt(i);
            mag[x-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char x = ransomNote.charAt(i);
            mag[x-'a']--;
            if(mag[x-'a']<0)
                return false;
        }
        return true;
    }
}
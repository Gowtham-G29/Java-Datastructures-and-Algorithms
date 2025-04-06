public class Anagram {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()>t.length()){
            return false;
        }
        int [] counter=new int[26];
        
        for(int i=0;i<s.length();i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        
        for(int count:counter){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1) since the size of the counter array is constant (26 for lowercase letters)

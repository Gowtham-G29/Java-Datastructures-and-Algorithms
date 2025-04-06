public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}

// Time Complexity: O(n*m) where n is the number of strings and m is the length of the longest string
// Space Complexity: O(1) since we are using constant space for the prefix variable
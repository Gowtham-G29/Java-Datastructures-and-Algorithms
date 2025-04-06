import java.util.*;

class Exercise {
     public int romanToInt(String s) {
        Map<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000); 

        int result=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1&& (map.get(s.charAt(i))<map.get(s.charAt(i+1))) ){
                  result=result-map.get(s.charAt(i));
            }else{
                result=result+map.get(s.charAt(i));
            }
        }  
        return result;    

    }
} 
// Time Complexity: O(n) where n is the length of the string s
// Space Complexity: O(1) since we are using a constant amount of space for the map and the result variable

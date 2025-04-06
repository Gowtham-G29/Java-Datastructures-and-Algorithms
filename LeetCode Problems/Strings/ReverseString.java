public class ReverseString {
    public void reverseString(char[] s) {
 int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }    }
}
// Time Complexity: O(n) where n is the length of the string
// Space Complexity: O(1) since we are using constant space for the two pointers and a temporary variable

//Check the given string is palindrome

import java.util.Scanner;

public class Palindrome {


    public static boolean checkPalindrome(String str){
        char[] charArray=str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str=sc.next();

        if(checkPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not an Palindrome");
        }

        
    }
}

import java.util.*;
public class FizzBuzz {
    public String[] fizzBuzz(int n) {
          String result[]=new String[n];
         for(int i=1;i<=n;i++){
             if(i%3==0&&i%5==0){
                 result[i-1]="FizzBuzz";
             }else if(i%3==0){
                 result[i-1]="Fizz";
             }else if(i%5==0){
                 result[i-1]="Buzz";
             }else{
                 result[i-1]=i+"";
             }
         }
         return result;
    }

    public static void main(String[]args){
        FizzBuzz fb=new FizzBuzz();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] result=fb.fizzBuzz(n);
        System.out.println(Arrays.toString(result));
    }
}
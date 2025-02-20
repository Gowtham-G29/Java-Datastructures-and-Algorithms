

//Find the missing number in range



import java.util.Scanner;

public class MissingNumber_inArray {

    public static int missingNumber(int arr[],int range){
        int length=range;
        int sum=(length*(length+1))/2;
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,8,9};
        int range=sc.nextInt();

        System.out.println("The missing number in range is 1 to "+range+" is :"+missingNumber(arr, range));



       

        
    }
}

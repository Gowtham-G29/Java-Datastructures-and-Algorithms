import java.util.Scanner;

public class Adding_Elements {


    public static void printElements(int arr[],int size){
        System.out.println("Elements in the array are: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


       printElements(arr,size);
        
    }
}

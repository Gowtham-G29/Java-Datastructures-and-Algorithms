//Resize the array

public class Resize_Array {


    public static int [] resize(int arr[], int capacity){
        int temp[]=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }


    public static void main(String[] args) {

        int [] arr= new int[10];
        System.out.println("Array length before resizing: "+arr.length);

        System.out.println("Elements in a array1: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        int arr2[]=  resize(arr, 20);
       
        System.out.println("Array length after resizing: "+arr2.length);
        System.out.println("Elements in a array: ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }



        
    }
}

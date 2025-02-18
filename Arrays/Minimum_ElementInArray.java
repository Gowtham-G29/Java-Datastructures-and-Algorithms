
//Minimum Element in a array


public class Minimum_ElementInArray {

    public static int minElement(int arr[]){
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        

        int[] arr={1,2,3,4,5,6,7,8};

        System.out.println(minElement(arr));

    }
}

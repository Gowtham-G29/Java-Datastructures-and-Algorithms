//Second maximum element in a array


public class SecondMax_array {

    public static int secondMax(int arr[]){
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }else if(arr[i]>second&&arr[i]!=max){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println("Second max element is: "+secondMax(arr));
        
    }
}

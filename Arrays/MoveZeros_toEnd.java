
//Move the zeros to the end of the array

public class MoveZeros_toEnd {

    public static void moveZeros(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0&&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,0,4,0,4,5,0,3};

        moveZeros(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

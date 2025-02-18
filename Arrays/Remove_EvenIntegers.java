
//Remove the even integers form an array


public class Remove_EvenIntegers {

    public static int[]removeEven(int arr[]){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] odd=new int[oddCount];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                odd[idx]=arr[i];
                idx++;
            }
        }

        return odd;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};

        int[] oddArr=removeEven(arr);

        for(int i=0;i<oddArr.length;i++){
            System.out.print(oddArr[i]+" ");
        }
    }
}
 
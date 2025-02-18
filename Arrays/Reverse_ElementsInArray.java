
//Reverse the elements in a array

public class Reverse_ElementsInArray {

    public void reverseArray(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8};

        Reverse_ElementsInArray rev=new Reverse_ElementsInArray();

        rev.reverseArray(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}

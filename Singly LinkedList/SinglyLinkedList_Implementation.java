public class SinglyLinkedList_Implementation {

    private  ListNode head; //instance variable of head

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){  //constructor
            this.data=data;
            this.next=null;
        }
        
    }

    //Delete the first node in a Singly list 
    public ListNode delFirst(){
        if(head==null){
            return null;
        }else{
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return temp;
        }
    }



    //Length of a linkedlist
    public int length(){

        if(head==null){
            return 0;
        }

        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }




    //print the elements in the linkedlist
    public void printElements(){
        
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+" ---> ");
            current=current.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }



    //Add the node at beggining
    public void addFirst(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Add the node at last
    public void addLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }



    //Insert node at a given position
    public void addAtPosition(int value,int position){
        ListNode newNode=new ListNode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;

        }else{
            ListNode prev=head;
            int count=1;
            while(count<position-1){
                prev=prev.next;
                count++;
            }
            ListNode current=prev.next;
            newNode.next=current;
            prev.next=newNode;
        }
    }

    public ListNode delLast(){
        if(head==null||head.next==null){
            return head;
        }
        else{
            ListNode current=head;
            ListNode prev=null;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;
            return current;
        }
    }



    //Main function
    public static void main(String[] args){
        SinglyLinkedList_Implementation sll=new SinglyLinkedList_Implementation();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);


        //connect to form a chain

        sll.head.next=second;
        second.next=third;
        third.next=fourth;

 
         sll.printElements();
         System.out.println("Length of a Linkedlist: "+ sll.length());
         sll.addFirst(12);
         sll.printElements();
         sll.addLast(13);
         sll.printElements();
         sll.addAtPosition(5,3);
         sll.printElements();
         System.out.println("Deleted element is:"+sll.delFirst().data);
         sll.printElements();
         System.out.println("Deleted element at last: "+sll.delLast().data);
         sll.printElements();
         System.out.println("Deleted element at last: "+sll.delLast().data);
         sll.printElements();



    
    }

    
}

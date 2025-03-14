import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;


    
    private class ListNode{

        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }
    
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }




    //return true if it is empty
    public boolean isEmpty(){
        return length==0;
    }

    //getter for length
    public int length(){
        return length;
    }


    




    //Insert node a first
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            tail=newNode;
        }else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }


    //Insert element in last
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            head=newNode;
        }else{
            tail.next=newNode;
        }
        newNode.previous=tail;
        tail=newNode;
        length++;
    }

    //delete firstnode in a list
    public void deleteFirst(){
        if(isEmpty()){
            return ;
        }
        ListNode temp=head;
        if(head==tail){
            tail=null;
        }else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        length--;

    }

    public void deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
       ListNode temp=tail;
       if(head==tail){
        head=null;
       }else{
         tail.previous.next=null;
       }
       tail=tail.previous;
       temp.previous=null;
       length--;

    }



    //print element in forward direction
    public void displayForward(){
        if(head==null){
            return;
        }
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    //print elements in reverse direction
    public void displayReverse(){
        if(tail==null){
            return;
        }
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.println("null");
    }

    
    //Main function
    public static void main(String[] args){

        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);
        dll.insertLast(5);
        dll.insertFirst(6);
        dll.insertFirst(7);
        dll.insertLast(9);

        
        dll.deleteFirst();
        dll.deleteLast();
        dll.deleteLast();

        dll.displayForward();
        dll.displayReverse();

    }
}

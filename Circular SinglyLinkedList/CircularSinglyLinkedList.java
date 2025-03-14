import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {


    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data=data;
        }
    }

    public CircularSinglyLinkedList(){
        this.last=null;
        this.length=0;

    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

   
    //create a circular linkedlist hardcoding
    public ListNode createCircularSinglyLinkedList(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(5);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=first;
        last=fifth;

        return last;

    }

    //Traverse the circular singlyLinkedList
    public void printElements(ListNode last){
        if(last==null){
            return;
        }
        ListNode temp=last.next;
        while (temp!=last) {
            System.out.print(temp.data+" -->");
            temp=temp.next; 
        }
        System.out.println(temp.data);
    }


    //Add the element in the first
    public void addFirst(ListNode tail, int data){
        ListNode newNode=new ListNode(data);
        if(tail==null){
            tail=newNode;
        }else{
            newNode.next=tail.next;
        }
        tail.next=newNode;
        length++;
    }

    //Add the element at the last
    public void addLast(ListNode last,int data){
        ListNode newNode=new ListNode(data);
        if(last==null){
            last=newNode;
            last.next=newNode;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        length++;
    }

    public void delFirst(ListNode last){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp=last.next;
        if(last.next==null){
            last=null;
        }else{
            last.next=temp.next;
            temp.next=null;
        }
        length--;
    }
   

    public static void main(String[] args) {
        CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
        ListNode last = csll.createCircularSinglyLinkedList();

        csll.printElements(last);
        csll.addFirst(last, 10);
        csll.printElements(last);
        csll.addFirst(last, 20);
        csll.printElements(last);   
        csll.addLast(last, 30);  
        csll.printElements(last);
        csll.delFirst(last);
        csll.printElements(last);



    }
}

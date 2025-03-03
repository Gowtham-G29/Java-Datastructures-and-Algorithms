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
    public void printElements(ListNode head){
        
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

     

    //delete the node at last 
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

// delete the node at a given position
    public void delAtPos(int position){
        if(position==1){
            head=head.next;
        }else{
            ListNode prev=head;
            int count=1;
            while(count<position-1){
                prev=prev.next;
                count++;
            }
            ListNode current=prev.next;
            prev.next=current.next;
        }
    }

    //search an element in a singly linked list

    public boolean searchElement(int element){
        ListNode current=head;
        while(current!=null){
            if(current.data==element){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //Reverse a singlyLinkedlist

    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        return prev;
        
    }

    //Find the Middle element in singlyLinkedlist

    public ListNode middleElement(ListNode head){
        if(head==null){
            return head;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null&&fastPtr.next!=null){
           slowPtr=slowPtr.next;
           fastPtr=fastPtr.next.next;
        }
        return slowPtr;
    }

    //Find the nth node from the last
    public ListNode nthNodeFromLast(ListNode head,int n){

        if(head==null){
            return null;
        }
        // if(n<=0){
        //     throw new illegalArgumentException("Invalid n value");
        // }
        ListNode refPtr=head;
        ListNode mainPtr=head;

        int count=0;
        while(count<n){
            refPtr=refPtr.next;
            count++;
        }
        while(refPtr!=null){
            refPtr=refPtr.next;
            mainPtr=mainPtr.next;
        }
        return mainPtr;
    }

    //Remove duplicates from a sortedList
    public ListNode removeDuplicates(ListNode head){
        if(head==null){
            return null;
        }
        ListNode current=head;
        while(current!=null&&current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }

    //Insert a node in a sorted LinkedList
    public ListNode insertTheNodeInSortedList(ListNode head,int value){
      
        ListNode newNode=new ListNode(value);
        // Case 1: Empty list or inserting at the head
        if (head == null || value < head.data) {
            newNode.next = head;
            return newNode; // New head of the list
        }
        ListNode current=head;
        ListNode temp=null;
        while(current!=null&&current.data<newNode.data){
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
        return head;

    }


    //Remove the given key from a singlyLinkedList
    public void removeTheKey(ListNode head,int key){
        if(head==null){
            return;
        }
        ListNode current=head;
        ListNode temp=null;

        if(current!=null&&current.data==key){
            head=head.next;
            return;
        }

        while(current!=null&&current.data!=key){
            temp=current;
            current=current.next;
        }
        if(current==null){
            return;
        }
        temp.next=current.next;
    }

    

   




    //Main function
    public static void main(String[] args){
        SinglyLinkedList_Implementation sll=new SinglyLinkedList_Implementation();
        sll.head=new ListNode(1);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(2);
        ListNode fourth=new ListNode(3);


        //connect to form a chain

        sll.head.next=second;
        second.next=third;
        third.next=fourth;

 
         sll.printElements(sll.head);
         System.out.println("Length of a Linkedlist: "+ sll.length());
         sll.addFirst(12);
         sll.printElements(sll.head);
         sll.addLast(13);
         sll.printElements(sll.head);
         sll.addAtPosition(5,3);
         sll.printElements(sll.head);
         System.out.println("Deleted element is:"+sll.delFirst().data);
         sll.printElements(sll.head);
         System.out.println("Deleted element at last: "+sll.delLast().data);
         sll.printElements(sll.head);
         System.out.println("Deleted element at last: "+sll.delLast().data);
         sll.printElements(sll.head);
         sll.delAtPos(3);
         sll.printElements(sll.head);
         System.out.println("Is element is present?: "+ sll.searchElement(5));


         ListNode reverseList= sll.reverse(sll.head);
         sll.printElements(reverseList);

         ListNode middleNode=sll.middleElement(reverseList);
         System.out.println("The middle element in a singlyLinkedlist: "+middleNode.data);

         ListNode nthNodeFromlast=sll.nthNodeFromLast(reverseList, 2);
         System.out.println("The Nth Node from the Last: "+nthNodeFromlast.data);

         sll.delLast();
         sll.delLast();
         sll.delLast();
         sll.delLast();
         sll.printElements(sll.head);

         sll.addFirst(1);
         sll.addFirst(2);
         sll.addFirst(3);
         sll.addFirst(4);
         sll.addFirst(4);
         sll.addFirst(5);
         sll.addFirst(9);

         sll.printElements(sll.head);

         ListNode identicalElements=sll.removeDuplicates(sll.head);
         sll.printElements(identicalElements);

         ListNode reverseList2= sll.reverse(sll.head);
         sll.printElements(reverseList2);

         ListNode addSorted= sll.insertTheNodeInSortedList(reverseList2,7);
         sll.printElements(addSorted);

         sll.removeTheKey(addSorted, 7);
         sll.printElements(addSorted);




        


         



    
    }

    
}

// Date 27 jan
// Date 28 jan
// Date 29 jan
public class LinkedList {
    public static class Node{
        int data;
        Node next;  // pointing to next node

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

         newNode.next=head; //link
         head=newNode; // newNode becomes the node
    }


    public void addLast(int data){
        Node newNode= new Node(data);
size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printNode(){
        if(head==null) System.out.println("LL is empty");
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addVal(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i =0;

        while (i<idx-1) {
            temp=temp.next;
            i++;
        }// this will make the temp to reach the prev node 

        newNode.next=temp.next;
        temp.next=newNode;
        
    }

    // removing first node in linked list
    public int removeFirst(){
        if(size==0) {
            System.out.println("Ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;
        }
        
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){

        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }


        // prev will be the size-2 node before the tail
        Node prev= head;
        for (int i = 0; i <size-2; i++) {
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    // search
    public int iterativeSearch(int k ){
        Node temp = head;

        int i = 0;
        while (temp!=null) {
            if(temp.data==k)
            {
                return i;
            }
            temp=temp.next;
            ++i;
        }
        return -1 ;
    }

    public int helper(Node head, int k){
        if(head==null) return -1;
        if(head.data==k) return 0; //bc the head lies on idx 0

        int idx= helper(head.next, k);
        if(idx==-1) return -1;

        return idx+1;
    }
    public int recursiveSearch(int k ){
        
        return helper(head,k);
    }


    // reverse a linked list iterative approach
    public void reverse(){
        Node prev= null;
        Node curr = tail = head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }
    public void deleteNthFromEnd(int n ){
        int sz = 0;
        Node temp =head;
        while (temp!=null) {
            temp= temp.next;
            sz++;
        }

        // remove first
        if(n == sz) {
            head= head.next;
            return;
        }


        // sz-n
        int i = 1;
        int iToFind= sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev= prev.next;
            i++;
        }

        prev.next= prev.next.next;
        return;


    }


    // finding the middle using the fast and slow method
    // this apporach says slow will jump by one step and fast will by 2 and when the fast reaches the end the slow will at the postion called middle
    public Node midNode(Node head)
{
    Node slow = head;
    Node fast = head;

    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast= fast.next.next;
    }

    return slow;

}    

    public boolean checkPalindrome(){

        if(head==null || head.next==null) return false;


        Node midNode=midNode(head);

        // reverse the right portion
        Node curr=midNode;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //check both sides
        Node right = prev;
        Node left=head;


        // comparing
        while (right!=null) {
            if(left.data!=right.data ){ return false;}
            left=left.next;
            right=right.next;
        }

        return true;


    }

//-------------------------------------------------
        public static void main (String args[]){
            // date 27
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addVal(2, 11);
        // ll.printNode();
        // System.out.println("The total size of nodes are "+ size);
        
        // date 28
        // ll.removeFirst();
        // ll.printNode();
        // ll.removeLast();
        // ll.printNode();
        // System.out.println(ll.recursiveSearch(11));
        // System.out.println(ll.recursiveSearch(33));     
        // ll.reverse();
        // ll.printNode();
        
        
        // date 29
        // **********find and remove nth node from the end*******
            // sizxe-n+1
            // ll.deleteNthFromEnd(3);
            // ll.printNode();

        // LL is palindrome
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(1);
        ll.printNode();
        System.out.println(ll.checkPalindrome());

    }   
}

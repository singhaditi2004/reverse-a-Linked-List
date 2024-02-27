/**
 * LinkedList
 */
public class LinkedList {
    //initializing head of linkedlist
    private LinkedList.Node head;
    //creating linkedlist class
    public static class Node {
        private int data; // data variable can be of any other type as required 
        private Node next; // pointer to the next node
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //displaying linkedlist
    public void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.printf(curr.data + " ->" + " ");
            curr = curr.next;
        }
        System.out.printf("null");
    }

    //reversing the linkedlist 
    public Node reverseLinkedList(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
    */
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(12);
        Node second = new Node(13);
        Node third = new Node(14);
        Node fourth = new Node(15);
        Node fifth = new Node(13);
        // connecting them
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fifth;
        fifth.next=third;
        list.display(list.head);
        list.display(list.reverseLinkedList(list.head));
    }

}

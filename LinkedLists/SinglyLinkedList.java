package LinkedLists;
public class SinglyLinkedList {
    
    private ListNode head;

    private static class ListNode {
        private int data; // Generic Type, in this case its integer type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void printList() { //Display the linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private int length() {

        //Declare a variable to keep track of the count
        ListNode current = head;
        int count = 0;

        if(current == null) { //if head is null return 0
            return 0;
        }

        //Traverse the whole linked list and increment the count
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    } 
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Now we will connect them together to form a chain
        sll.head.next = second; // 10 --> 1
        second.next = third;    // 10 --> 1 --> 8
        third.next = fourth;    // 10 --> 1 --> 8 --> 11 --> null

        sll.printList();
        System.out.println("Length of linked list: " + sll.length() + "\n");

        //Insert a new node at the beginning
        System.out.println("After inserting a 3 nodes at the beginning:");
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.printList();
        System.out.println("Length of linked list: " + sll.length());

        
    }

}

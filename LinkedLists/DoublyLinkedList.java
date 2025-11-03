package LinkedLists;

import java.util.LinkedList;


public class DoublyLinkedList {
    

    public static void main(String[] args) {

        // SinglyLinked //

        LinkedList<String> linkedList = new LinkedList<String>();
        // linkedList.push("A"); //add to the front
        // linkedList.push("B");
        // linkedList.push("C");

        // linkedList.pop(); //remove from the front

        linkedList.offer("A"); //add to the front
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E"); //add at index 4
        linkedList.remove("E"); // remove specific element
        System.out.println(linkedList.indexOf("D")); //get index of element
        // linkedList.poll(); //remove from the front
        System.out.println("Linked List: " + linkedList);

        System.out.println(linkedList.peekFirst()); //get first element
        System.out.println(linkedList.peekLast()); //get last element

        String firstElement = linkedList.removeFirst(); //remove first element
        String lastElement = linkedList.removeLast(); //remove last element

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
        System.out.println("Linked List after removals: " + linkedList);

        linkedList.addFirst("0"); //add to the front
        linkedList.addLast("Z"); //add to the end
        System.out.println("Linked List after additions: " + linkedList);
    }
}

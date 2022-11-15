import com.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(1);
        linkedList.addLast(23);
        linkedList.addLast(33);
        linkedList.addFirst(3);
        linkedList.addLast(7);
        linkedList.printLinkedList();

        System.out.println(linkedList.returnWithoutDeleteFromHead());
        linkedList.printLinkedList();

        System.out.println(linkedList.returnAndDeleteFromHead());
        linkedList.printLinkedList();

        System.out.println(linkedList.returnWithoutDeleteFromTail());
        linkedList.printLinkedList();

        System.out.println(linkedList.returnAndDeleteFromTail());
        linkedList.printLinkedList();

    }
}
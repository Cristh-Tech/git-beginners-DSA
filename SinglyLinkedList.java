
public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        System.out.print("\nForward: ");
        Node temp = first;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }

        System.out.println();
    }
}
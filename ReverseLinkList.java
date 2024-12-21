public class ReverseLinkList {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
public static Node reverseLinkedListExceptFirstAndLast(Node head) {
    if (head == null || head.next == null || head.next.next == null) {
        return head;
    }

    Node first = head;
    Node last = head;
    while (last.next != null) {
        last = last.next;
    }

    Node prev = first;
    Node current = first.next;
    Node next = null;
    Node newHead = first;

        while (current != last) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    
        first.next.next = last;
        last.next = null;
        first.next = prev;

        return newHead;
    }
    
    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);
    
        System.out.println("Original Linked List:");
        printList(head);
    
        Node reversedHead = reverseLinkedList(head);
        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    
        Node node5_2 = new Node(5);
        Node node4_2 = new Node(4, node5_2);
        Node node3_2 = new Node(3, node4_2);
        Node node2_2 = new Node(2, node3_2);
        Node head2 = new Node(1, node2_2);
    
        Node reversedExceptFirstAndLast = reverseLinkedListExceptFirstAndLast(head2);
        System.out.println("Reversed Linked List Except First and Last:");
        printList(reversedExceptFirstAndLast);
    }
    
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


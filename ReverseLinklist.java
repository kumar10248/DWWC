//reverse linklist using recursion
public class ReverseLinklist {
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private static node reverse(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        node rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
    private static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(5);
        head.next.next.next.next.next = new node(6);
        head.next.next.next.next.next.next = new node(7);
        head.next.next.next.next.next.next.next = new node(8);
        head.next.next.next.next.next.next.next.next = new node(9);
        head.next.next.next.next.next.next.next.next.next = new node(10);
        System.out.println("Original Linklist:");
        print(head);
        System.out.println();
        System.out.println("Reversed Linklist:");
        head = reverse(head);
        print(head);
    }

    
}

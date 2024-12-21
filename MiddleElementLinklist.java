public class MiddleElementLinklist {
    
    public static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }
        
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        
        Node middle = findMiddle(head);
        if (middle != null) {
            System.out.println("The middle element is " + middle.data);
        } else {
            System.out.println("The list is empty");
        }
    }
}
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
package linked_list;

public class ListAllNodes {
    public static void printNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);// head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;// 10->20
        b.next = c;// 10->20->30
        c.next = d;// 10->20->30->40
        d.next = e;// 10->20->30->40->50

        printNode(a);

        // for (int i = 0; i <5; i++) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

    }
}

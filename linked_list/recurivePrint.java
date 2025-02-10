package linked_list;

public class recurivePrint {

    public static void ReversePrint(Node head) {
        if (head == null)
            return;// base case
        ReversePrint(head.next);// call
        System.out.println(head.data);// print
    }

    public static void Print(Node head) {
        if (head == null)
            return;// base case
        Print(head.next);// call
        System.out.println(head.data);// print
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

        Print(a);
        ReversePrint(a);
    }
}

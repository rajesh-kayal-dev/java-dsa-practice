package linked_list;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ListNodeClass {

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

        Node temp = a;
        System.out.println(temp.data);// 10

        temp = temp.next;
        System.out.println(temp.data);// 10->20
        System.out.println(temp.next.data);// 10->20->30

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        // System.out.println(a.next.next.next.next.next.data);

    }

}
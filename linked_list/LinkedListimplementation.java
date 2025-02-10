package linked_list;

class SLL {
    Node head;
    Node tail;
    int size;

    /// INSERTION NODE
    void inserAtTail(int val) {
        Node temp = new Node(val);

        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void inserAtHead(int val) {
        Node temp = new Node(val);

        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val) {
        if (idx == 0) {
            inserAtHead(val);
            return;
        }
        if (idx == size || idx < 0) {
            inserAtTail(val);
            return;
        }
        if (idx > size) {
            System.out.println("Invalid index!!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        // shift at position
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        // inssertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx) {
        if (idx == size - 1)
            return tail.data;
        if (idx >= size || idx < 0) {
            System.out.println("Invalid index!!");
            return -1;

        }
        Node temp = head;
        for (int i = 0; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    void set(int idx, int val) throws Error {
        if (idx == size - 1) {
            tail.data = val;
        }

        if (idx >= size || idx < 0) {
            // System.out.println("Invalid index!!");
            throw new Error("Error bhai! Invalid index.");
        }
        Node temp = head;
        for (int i = 0; i <= idx; i++) {
            temp = temp.next;
        }
        temp.data = val;
    }

    /// DELETION NODE
    void deleteAtHead() throws Error {
        if (head == null)
            throw new Error("List is Empty!");
        head = head.next;
        size--;
    }

    void delete(int idx) throws Error {
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (head == null)
            throw new Error("List is Empty!");
        if (idx < 0 || idx >= size) {
            throw new Error("Invalid Index!");
        }

        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail)
            tail = temp;
        temp.next = temp.next.next;
        size--;

    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size() {
        System.out.println("Size is:" + size);
    }
}

public class LinkedListimplementation {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.inserAtTail(10);
        list.inserAtTail(20);
        list.inserAtTail(30);
        list.display();
        System.out.println(list.size);
        list.inserAtHead(50);
        list.display();
        System.out.println(list.size);

        list.insert(2, 100);
        list.display();
        list.insert(0, 200);
        list.display();
        list.insert(6, 150);
        list.display();
        System.out.println("\nGet index vale:" + list.get(3));
        list.display();
        list.set(2, 90);
        list.display();
        list.deleteAtHead();
        list.display();
        list.delete(4);
        list.display();
        System.out.println("tail is:" + list.tail.data);

    }
}
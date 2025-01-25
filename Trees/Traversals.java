package Trees;

class Traversal {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        System.out.println("Preorder : ");
        preorder(a);
        System.out.println();

        System.out.println("Inorder : ");
        inorder(a);
        System.out.println();

        System.out.println("Postorder : ");
        postorder(a);
    }

    // Preorder Traversal: Root, Left, Right
    public static void preorder(Node root) {
        if (root == null) {
            return;  // Base case: return if node is null
        }
        System.out.print(root.val + " ");  // Visit the root node
        preorder(root.left);  // Traverse the left subtree
        preorder(root.right); // Traverse the right subtree
    }

    // Inorder Traversal: Left, Root, Right
    public static void inorder(Node root) {
        if (root == null) {
            return;  // Base case: return if node is null
        }
        inorder(root.left);  // Traverse the left subtree
        System.out.print(root.val + " ");  // Visit the root node
        inorder(root.right); // Traverse the right subtree
    }

    // Postorder Traversal: Left, Right, Root
    public static void postorder(Node root) {
        if (root == null) {
            return;  // Base case: return if node is null
        }
        postorder(root.left);  // Traverse the left subtree
        postorder(root.right); // Traverse the right subtree
        System.out.print(root.val + " ");  // Visit the root node
    }
}

class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

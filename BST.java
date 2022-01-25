class BST {
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    void insertCall(int key) {
        root = insertNode(root, key);
    }

    Node insertNode(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    // Node deleteNode(Node root, int data){
    // if
    // }

    void callSearch(int data) {
        searchNode(root, data);
    }

    Node searchNode(Node root, int data) {
        if (root == null || data == root.data) {
            System.out.println("this is searched " + root.data);
            return root;
        }
        if (data < root.data) {
            return searchNode(root.left, data);
        } else {

            return searchNode(root.right, data);
        }
    }

    void callInorder() {
        inorderPrint(root);
    }

    void inorderPrint(Node root) {
        if (root != null) {
            inorderPrint(root.left);
            System.out.println(root.data);
            inorderPrint(root.right);

        }
    }

    public static void main(String args[]) {
        // System.out.println("Hello, Mehul hereee.");

        BST tree = new BST();

        tree.insertCall(100);
        tree.insertCall(10);
        tree.insertCall(50);
        tree.insertCall(20);
        tree.insertCall(150);

        tree.callInorder();

        tree.callSearch(150);

    }

}
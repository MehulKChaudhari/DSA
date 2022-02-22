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

    // Delete a node.
    void deleteCall(int key) {
        root = deleteNode(root, key);
    }

    Node deleteNode(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minimum(root.right);

            root.right = deleteNode(root.right, root.data);

        }
        return root;
    }

    void callFunction(String call) {

        switch (call) {
            case "minimum":
                minimum(root);
                break;
            case "maximum":
                maximum(root);
                break;
            case "inorder":
                inorderPrint(root);
                break;
        }

    }

    int minimum(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        System.out.println("Minimum is " + root.data);
        return root.data;
    }

    int maximum(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        System.out.println("Miximum is " + root.data);
        return root.data;
    }

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
        tree.insertCall(1);

        tree.callFunction("inorder");
        tree.callFunction("minimum");
        tree.callFunction("maximum");
        tree.deleteCall(10);
        System.out.println("---------- this is after delete ---------");
        tree.callFunction("inorder");
    }

}

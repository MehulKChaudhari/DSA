class LinkedList {

    Node headNode;

    static class Node {
        int key;
        Node next;

        Node(int d) {
            key = d;
            next = null;
        }
    }

    public static LinkedList insertNode(LinkedList list, int key) {

        Node newNode = new Node(key);
        newNode.next = null;

        if (list.headNode == null) {
            list.headNode = newNode;
        } else {
            Node currNode = list.headNode;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        return list;
    }

    public static LinkedList deleteNode(LinkedList list, int key) {
        Node currNode = list.headNode;
        Node prevNode = list.headNode;

        while (currNode.next != null && currNode.key != key) {
            currNode = prevNode;
            currNode = currNode.next;

        }
        System.out.println("deleting");
        if (currNode.key == key) {
            prevNode.next = currNode.next;
        }

        return list;
    }

    static void printList(LinkedList list) {
        Node currNode = list.headNode;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.key + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String agrs[]) {
        LinkedList list = new LinkedList();

        for (int i = 0; i <= 15; i++) {

            list = insertNode(list, i);
        }
        
        list = deleteNode(list, 10);

        printList(list);
    }
}
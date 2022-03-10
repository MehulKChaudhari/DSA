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
        Node prevNode = null;

        if (currNode != null && currNode.key == key) {
            list.headNode = currNode.next;
            System.out.println(" Deleted ===>" + key);
            return list;

        }

        while (currNode.next != null && currNode.key != key) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        if (currNode != null && currNode.key == key) {
            prevNode.next = currNode.next;
            System.out.println(" Deleted ===>" + key);
        } else {
            System.out.println(key + " Was not found!!!");
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

        list = deleteNode(list, 20);

        printList(list);
    }
}
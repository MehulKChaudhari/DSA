public class Queue {
    static final int MAX = 10;
    int data[] = new int[MAX];
    int head, tail;

    Queue() {
        head = tail = 0;
    }

    boolean isQueueEmpty() {
        if (head == tail) {
            return true;
        }
        return false;
    }

    boolean isQueueFull() {
        if (head == tail + 1) {
            return true;
        }
        return false;
    }

    int Enqueue(int element) {

        if (isQueueFull()) {
            System.out.println("The Queue overflow");
            return element;
        }
        data[tail] = element;
        if (tail == MAX - 1) {
            tail = 0;
            System.out.println("Enqueue " + element);
        } else {
            tail++;
            System.out.println("Enqueue " + element);

        }
        return element;
    }

    int Dequeue() {
        if (isQueueEmpty()) {
            System.out.println("the queue underflow");
            return -1;
        }
        int x = data[head];
        if (head == MAX) {
            head = 0;
            System.out.println("Dequeue " + x);

        } else {
            head++;
            System.out.println("Dequeue " + x);
        }
        return x;
    }

    void display() {
        for (int i = 0; i < MAX; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println("Head is at" + head);
        System.out.println("Tail is at" + tail);

    }

    public static void main(String args[]) {
        Queue Q = new Queue();
        Q.Enqueue(25);
        Q.Enqueue(20);
        Q.Enqueue(10);
        Q.Enqueue(01);
        Q.Enqueue(25);
        Q.Enqueue(73);
        Q.Dequeue();
        Q.Dequeue();
        System.out.println("The Queue after dequeue");
        Q.display();
        Q.Enqueue(25);
        Q.display();

    }

}
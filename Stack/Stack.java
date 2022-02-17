class Stack {
    static final int MAX = 100;
    int top;
    int arr[] = new int[MAX];

    Stack() {
        top = -1;
    }

    boolean isStackEmpty() {
        return (top < 0);
    }

    boolean isStackFull() {
        return (top == MAX - 1);
    }

    public void push(int item) {
        {
            if (isStackFull()) {
                System.out.println("Stack Overflowed\n");
                System.exit(1);
            }

            System.out.println(item + " Pushed into stack ");
            arr[++top] = item;
        }
    }

    public int pop() {
        if (isStackEmpty()) {
            System.out.println("Stack is Underflowed\n");
            System.exit(1);
        }
        int item = arr[top--];
        System.out.println(item + " pop from stack ");
        return item;
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + arr[i]);
        }

    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
    }
}
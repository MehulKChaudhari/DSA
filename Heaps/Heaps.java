class Heaps {
    private int[] Heap;
    private int size;
    private int maxSize;

    public Heaps(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize];
    }

    int Parent(int i) {
        return i / 2;
    }

    int Left(int i) {
        return 2 * i;
    }

    int Right(int i) {
        return (2 * i) + 1;
    }

    void swap(int one, int two) {
        int tmp;
        tmp = Heap[one];
        Heap[one] = Heap[two];
        Heap[two] = tmp;
    }

    public void Max_Heapify(int i) {
        int l = Left(i);
        int r = Right(i);
        int largest;

        if (l <= size && Heap[l] > Heap[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= size && Heap[r] > Heap[largest]) {
            largest = r;
        }
        if (largest != i) {

            int temp = Heap[largest];
            Heap[largest] = Heap[i];
            Heap[i] = temp;
            Max_Heapify(largest);
        }
    }

    public void insert(int i) {

        Heap[size] = i;
        int current = size;
        while (Heap[current] > Heap[Parent(current)]) {
            swap(current, Parent(current));
            current = Parent(current);
        }
        size++;
    }

    public void delete(int i) {

        Heap[i] = Heap[size];
        size--;

        Max_Heapify(i);
    }

    public void printHeap() {

        for (int i = 0; i < size; i++) {

            System.out.println(Heap[i]);
        }
    }

    public static void main(String args[]) {
        Heaps heap = new Heaps(10);

        heap.insert(10);
        heap.insert(15);
        heap.insert(20);
        heap.insert(25);
        heap.insert(12);
        heap.printHeap();
        System.out.println("before delete");
        heap.delete(4);
        System.out.println("after delete");
        heap.printHeap();
    }
}
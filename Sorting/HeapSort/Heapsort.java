public class Heapsort {

    int Parent(int i) {
        return i / 2;
    }

    int Left(int i) {
        return 2 * i;
    }

    int Right(int i) {
        return (2 * i) + 1;
    }

    public void Max_Heapify(int arr[], int n, int i) {
        int l = Left(i);
        int r = Right(i);
        int largest;

        if (l < n && arr[l] > arr[i])
            largest = l;
        else
            largest = i;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            Max_Heapify(arr, n, largest);
        }
    }

    void Build_Max_Heap(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            Max_Heapify(arr, n, i);
        }
    }

    void heap_sort(int arr[]) {
        int n = arr.length;
        Build_Max_Heap(arr);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            Max_Heapify(arr, i, 0);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 50, 61, 23, 89, 52, 63, 45, 3, 5, 89 };

        Heapsort sort = new Heapsort();
        sort.heap_sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }

}

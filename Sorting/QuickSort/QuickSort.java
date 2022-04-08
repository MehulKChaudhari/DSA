public class QuickSort {

    void quick_sort(int A[], int p, int r) {
        if (p < r) {
            int q = Partition(A, p, r);
            quick_sort(A, p, q - 1);
            quick_sort(A, q + 1, r);
        }
    }

    int Partition(int A[], int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
                i = i + 1;
                int temp;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp;
        temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return i + 1;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int array[] = { 10, 50, 61, 23, 89, 52, 63, 45, 3, 5, 89 };
        sort.quick_sort(array, 0, array.length - 1);

        printArray(array);
    }

}
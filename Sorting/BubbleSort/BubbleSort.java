public class BubbleSort {

    void bubble_sort(int A[]) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int array[] = { 10, 50, 61, 23, 89, 52, 63, 45, 3, 5, 89 };
        sort.bubble(array);

        printArray(array);
    }
}

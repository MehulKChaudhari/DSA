public class InsertionSort {

    void Insertion_Sort(int arr[]) {

        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort list = new InsertionSort();

        int array[] = { 90, 5, 9, 6, 2, 3, 4, 5, 4, 1, 5, 2, 8, 7 };
        list.Insertion_Sort(array);

        printArray(array);
    }
}

class MergeSort {

    void merge(int A[], int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = A[q + 1 + j];
        }
        int i = 0, j = 0, k = p;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                A[k] = leftArr[i];
                i++;
            } else {
                A[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = rightArr[j];
            j++;
            k++;
        }

    }

    void merge_sort(int arr[], int left, int right) {
        if (left < right) {
            int midPoint = (left + right) / 2;

            merge_sort(arr, left, midPoint);
            merge_sort(arr, midPoint + 1, right);

            merge(arr, left, midPoint, right);
        }

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int array[] = { 10, 50, 61, 23, 89, 52, 63, 45, 3, 5, 89 };
        sort.merge_sort(array, 0, array.length - 1);

        printArray(array);
    }
}
class BinarySearch {

    String binary_search(int item, int arr[]) {
        int min = 0;
        int max = arr.length - 1;
        int ele, i;

        while (min <= max) {
            i = (int) Math.floor((min + max) / 2);
            ele = arr[i];

            if (item < ele) {
                min = i + 1;
            } else if (item > ele) {
                max = i - 1;
            } else {
                return item + " Found at index " + i;
            }
        }
        return "Item not found";
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int array[] = { 10, 20, 40, 50, 52, 80, 89, 96, 98 };
        String result = search.binary_search(100, array);

        System.out.println(result);
    }
}

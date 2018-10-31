import java.util.*;
class BinarySearch {
    static int binarySearch(int arr[], int left, int right, int element) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == element)
                return mid;

            if (arr[mid] > element)
                return binarySearch(arr, left, mid - 1, element);

            return binarySearch(arr, mid + 1, right, element);
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // defines the length of array
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();  // user input
        }
        int element = sc.nextInt(); // element to find its index in the given array
        int result = binarySearch(arr, 0, n - 1, element);
        if (result == -1)
            System.out.println("Element not present in the given array");
        else
            System.out.println("Element found at index " + result);
    }
}


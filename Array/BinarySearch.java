import java.util.*;

class BinarySearch {

    static int SearchBinary(int[] arr, int target) {
        int left = arr[0];
        int right = arr[arr.length - 1];

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element in the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search : ");

        int target = sc.nextInt();

        int result = SearchBinary(arr, target);

        if (result == -1) {
            System.out.println("Not found in the array ");
        } else {
            System.out.println("Element found ");
        }

        sc.close();

    }
}
// package Sorting;

// import java.util.Arrays;

// public class BubbleSort {

//     static void  PrintArr(int arr[]){
//         for(int i=0; i < arr.length; i++){
//             System.out.print(arr[i]+"");
//         }
//     }

//     static void SortingBubble(int[] arr) {

//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) {
//             int flag = 0;
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//                 flag =1;
//             }

//             if (flag == 0) {
//                 System.out.println("Already sorted");
//             }
//             break;
//         }

//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 2, 9, 1, 5, 6 };

//         System.out.println("Unsorted Array : " + Arrays.toString(arr));
//         SortingBubble(arr);
//         System.out.print("Sorted array : " + Arrays.toString(arr));

//     }

// }

// // public class LeftRotateD {

// //     static  void PrintArray(int[] arr){
// //         for(int i=0; i< arr.length; i++){
// //             System.out.print(arr[i]+" ");
// //         }
// //     }

// //     static void  LeftRotateArray(int[] arr){
// //         int temp = arr[0];
// //         for(int i=1; i< arr.length; i++){
// //             arr[i-1]  =arr[i];
// //         }
// //          arr[arr.length-1] = temp;
// //     }
// // //    

// //      static  void  LeftRotateArrayByDPlace(int[] arr, int d){
// //         for(int i=0; i< d; i++){
// //             LeftRotateArray(arr);
// //         }
// //      }

// //     public static void main(String[] args){
// //         int[] arr = { 10, 20 , 30, 40,50,60};
// //         int d = 3;

// //         LeftRotateArrayByDPlace(arr, d);
// //         PrintArray(arr);

// //     }

// // }

// // -------------------Second Solution-------------------

// // public class LeftRotateD {

// //     static  void PrintArray(int[] arr){
// //         for(int i=0; i< arr.length; i++){
// //             System.out.print(arr[i]+" ");
// //         }
// //     }

// //     static void  LeftRotateArray(int[] arr, int d){
// //         int[] temp = new int[arr.length];
// //         int index =0;

// //         for(int i=d; i<arr.length; i++){
// //             temp[index++] =arr[i];

// //         }

// //         for(int i=0; i<d; i++){
// //             temp[index++] = arr[i];
// //         }

// //         for(int i=0; i< arr.length; i++){
// //             arr[i] = temp[i];
// //         }

// //     }

// //     public static void main(String[] args){
// //         int[] arr = { 10, 20 , 30, 40,50,60};
// //         int d = 3;

// //         LeftRotateArray(arr, d);
// //         PrintArray(arr);

// //     }

// // }

// public class LeftRotateD {

//     static void PrintArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     static void reverseArray(int[] arr, int start, int end) {

        

//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }

//     }

//     static int[] LeftRotateArray(int[] arr, int d, int n) {
//          d  = d%n;
//         reverseArray(arr, 0, d-1);
//         reverseArray(arr, d, n - 1);
//         reverseArray(arr, 0, n-1);

//         return  arr;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50, 60 };
//         int d = 3;
//         int n = arr.length;

//          LeftRotateArray(arr, d, n);
//          PrintArray(arr);
        

//     }

// }

// public class TargetSum {
//   public static void main(String[] args){
//     int[] arr = {4,6,3,5,8,2};
//     int target = 7;

//     int count = 0;
//     for(int i =0; i< arr.length; i++){
//       for(int j= i+1; j< arr.length; j++){
//         if(arr[i]+ arr[j] == target ){
//           count++;
//         }
//       }
//     }

//     System.out.print("Count : "+ count);

//   }
  
// }

import java.util.*;
public class TargetSum {

    static int FindMax(int[] arr){
      int max = Integer.MIN_VALUE;

      for(int i=0; i<arr.length; i++ ){
        if(arr[i]> max){
          max = arr[i];
        }

      }
      return max;
    }

    static int SecondLargestElement(int[] arr){

      int second = FindMax(arr);

      for(int i=0; i< arr.length; i++){
         if(arr[i] == second){
           arr[i] = Integer.MIN_VALUE;
         }
      }


      int ans = FindMax(arr);
      return ans;
      
     


    }











  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the "+n+"elements: ");

    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();


    }


    System.out.println("Max Element : "+ FindMax(arr));

    System.err.println("Second Max element : "+SecondLargestElement(arr));

    sc.close();
    

  }
  
}

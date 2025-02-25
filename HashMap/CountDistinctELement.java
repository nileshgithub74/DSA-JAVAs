package HashMap;

// public class CountDistinctELement {

//   public static void main(String[] args){
//     int[] arr  = { 5, 10, 5, 4, 5,10,20};
//     int count = 0;

//     for(int i =0; i< arr.length; i++){
      
//       for(int j =1; j < arr.length ; j++){
//         if(arr[i] != arr[j]){
//           count++;
//         }
       
//       } break;


//     }
//     System.out.println(count);
//   }
  
// }

import java.util.*;
public class CountDistinctELement{
  public static void main(String[] args){
    HashSet<Integer> hs = new HashSet<>();
    int[] arr  = { 5, 10, 5, 4, 5,10,20};

    for(int x : arr){
      hs.add(x);
    }

    System.err.println(hs.size());


  }
}
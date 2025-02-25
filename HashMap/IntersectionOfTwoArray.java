// package HashMap;

// public class IntersectionOfTwoArray {
//   public static void main(String[] args){

//     int a[] = {5, 10, 15, 5};
//     int b[] = {10, 15, 4, 5};
//     int k=0;


//     int[] ans = new int[b.length];

//     for(int i=0; i<a.length; i++){
//       boolean isAdded = false;
//       for(int j =0; j < b.length; j++){
//         if(a[i] == b[j]){
//           if(!isAdded){
//           ans[k++]  = a[i];
//           isAdded = true;
//           }
//         }
//       }
//     }

//     for(int i=0; i< k; i++){
//       System.out.println(ans[i]);
//     }




//   }
  
// }










package HashMap;
import java.util.*;

public class IntersectionOfTwoArray {
  public static void main(String[] args){

    int a[] = {5, 10, 15, 5};
    int b[] = {10, 15, 4, 5};
   

    HashSet<Integer> hs = new HashSet<>();

    HashSet<Integer> intersection = new HashSet<>();

    for(int x : a){
      hs.add(x);
    }

    for(int num : b){
      if(hs.contains(num)){
        intersection.add(num);
       
      }
      
    }
    System.out.println(intersection);







  }
  
}


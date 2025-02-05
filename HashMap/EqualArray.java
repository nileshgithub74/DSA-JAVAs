package HashMap;

import java.util.*;

public class EqualArray {

  public static boolean equalArrayorNot(int[] arr1, int[] arr2){

    if(arr1.length != arr2.length){
      return false; 
    }
    
    Arrays.sort(arr1);
    Arrays.sort(arr2);



    for(int i=0; i< arr1.length; i++){
      if(arr1[i] != arr2[i]){
        return false;
      }
    }

    return true;

  }

  public static void main(String[] args){

    int[] arr1 = { 3, 5, 2, 5, 2 };
    int[] arr2 = { 2, 3, 5, 5, 89};

    

    if(equalArrayorNot(arr1, arr2)){
      System.out.println("Both array are equal");
    }else{
      System.out.println("Not equal ");
    }












  }
  
}

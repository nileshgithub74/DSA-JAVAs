package Sorting;

import java.util.Arrays;

public class BubbleSort {

    static  void SortingBubble(int[] arr){


        for(int i=0; i< arr.length-1; i++){
            int flag = 0;
            for(int j= 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }

            }
            if(flag == 0){
                 break;
            }
        }

    







    }







    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 5, 6};


        System.out.println("Unsorted Array : "+ Arrays.toString(arr));
        SortingBubble(arr);
      System.out.print("Sorted array : "+ Arrays.toString(arr));
        
         
    }
    
}

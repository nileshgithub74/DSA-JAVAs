// public class LeaderElement {

//     static void PrintLeaderElement(int[] arr){
//         int n = arr.length;

//         int  Leader  =  arr[n-1];
//         System.out.print(Leader+" ");

//         for(int  i=n-2; i>=0; i--){
//             if(arr[i] > Leader){
//                 Leader = arr[i];
//                 System.out.print(Leader+" ");

//             }

//         }

//     }

//     public static void main(String[] args){
//         int[] arr = {16, 17, 4, 3, 5, 2};
//         PrintLeaderElement(arr);

//     }
// }

import java.util.*;

public class LeaderElement {

    static void PrintLeaderElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> arrlist = new ArrayList<>();

        int Leader  = arr[n-1];
        arrlist.add(Leader);
        
        for(int i= n-2; i>=0; i--){
            if(Leader < arr[i]){
                Leader = arr[i];
                arrlist.add(Leader);

            }
        }

        Collections.reverse(arrlist);

        // for(int x : arrlist){
        //     System.out.print(x+" ");
        // }
        System.out.println(arrlist);




    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        PrintLeaderElement(arr);

    }
}

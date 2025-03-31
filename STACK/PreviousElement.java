
import java.util.Stack;


// public class PreviousElement {
//     public static void main(String[] args){
//         int[] arr = {20,30,10,5,15};



//         for(int i =0; i< arr.length; i++){
//             int result = -1;

//             for(int j = i-1; j>=0; j--){
//                 if(arr[j]> arr[i]){
//                     result  = arr[j];
//                     break;
//                 }
//             }
//             System.out.println(result+" ");
//         }
        

//     }
// }



// public class PreviousElement {
//     public static void main(String[] args){
//         int[] arr = {20,30,10,5,15};
//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();
//         int pg = -1;


//         for(int i=0; i<n; i++ ){
//             while( !st.isEmpty() &&  st.peek() <= arr[i] ){
//                 st.pop();
//             }
//             pg = (st.isEmpty()) ? -1 : st.peek();
//             System.out.print(pg+" ");
           

//          st.push(arr[i]);
//         }
        



        

//     }
// }


import java.util.*;

public class NextGreatorElement {
    public static void main(String[] args) {
        int[] arr = {20,30,10,5,15};
        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        int[] result = new int[n];

        Arrays.fill(result, -1);

        for(int  i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            result[i] = (st.isEmpty() ? -1 : st.peek());


           

            st.push(arr[i]);

        }

        for(int x : result){
            System.out.print(x+" ");
        }
       









    
    }}
    


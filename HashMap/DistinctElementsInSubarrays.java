// package HashMap;

// import java.util.*;

// public class DistinctElementsInSubarrays {
//     public static void countDistinctInSubarrays(int[] arr, int k) {


//         Map<Integer, Integer> freqMap = new HashMap<>();
//         int distinctCount = 0;

    
//         for (int i = 0; i < k; i++) {
//             freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
//         }

//         System.out.println("Distinct elements in first window: " + freqMap.size());


//         for (int i = k; i < arr.length; i++) {
         
//             int outgoing = arr[i - k];
//             freqMap.put(outgoing, freqMap.get(outgoing) - 1);
//             if (freqMap.get(outgoing) == 0) {
//                 freqMap.remove(outgoing);
//             }

//             int incoming = arr[i];
//             freqMap.put(incoming, freqMap.getOrDefault(incoming, 0) + 1);

     
//             System.out.println("Distinct elements in window [" + (i - k + 1) + " to " + i + "]: " + freqMap.size());
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 1, 3, 4, 2, 3};
//         int k = 4;
//         countDistinctInSubarrays(arr, k);
//     }
// }

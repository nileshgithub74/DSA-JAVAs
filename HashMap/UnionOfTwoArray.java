// package HashMap;

// import java.util.HashSet;

// public class UnionOfTwoArray {
//   public static void main(String[] args){
//     int a[] = { 5,10,15, 5};
//     int b[] = { 10, 15, 4,5};
   

//     HashSet<Integer> hs = new HashSet<>();


//     for(int x : a){
//       hs.add(x);
//     }
//     for(int y : b){
//       hs.add(y);
//     }

//     System.out.println(hs);

   
//   }
  
// }



package HashMap;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int a[] = {5, 10, 15, 5};
        int b[] = {10, 15, 4, 5};

        int[] ans = new int[a.length + b.length];
        int k = 0;

        // Add all elements of a[] to ans[]
        for (int i = 0; i < a.length; i++) {
            ans[k++] = a[i];
        }

        // Add elements of b[] only if they are not already present in ans[]
        for (int i = 0; i < b.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < k; j++) { // FIXED: Compare against existing elements in ans[]
                if (b[i] == ans[j]) { 
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent) {
                ans[k++] = b[i]; // Insert only if not present
            }
        }

        // Print only the first 'k' elements
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

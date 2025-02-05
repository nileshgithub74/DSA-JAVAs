package HashMap;

import java.util.*;   

public class FirstNonRepeating {
    public static int findFirstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

       
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2};
        System.out.println("First Non-Repeating Element: " + findFirstNonRepeating(arr));
    }
}

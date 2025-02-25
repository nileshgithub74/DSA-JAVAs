import  java.util.*;

public class RepeatedElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,53,3,3,3,2,4,4,24,4,5};

        HashSet<Integer>   hs = new HashSet<>();
        HashSet<Integer>  duplicate = new HashSet<>();

        for(int   num : arr){
            if(!hs.contains(num)){
                hs.add(num);
            }
        }

    System.out.println(duplicate);






    }
    
}

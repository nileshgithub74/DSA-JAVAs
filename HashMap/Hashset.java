package HashMap;
import java.util.*;

public class Hashset {
  public static void main(String[] args){


    HashSet<Integer> hs = new HashSet<>();

    hs.add(10);
    hs.add(20);


    for(Integer x : hs){
      System.out.println(x);
    }

    
  }
  
}

package HashMap;
import java.util.*;

public class Hashmap {
  public static void main(String[] args){
     HashMap<Integer, String> hm = new HashMap<>();


    hm.put(10,"Nilesh");
    hm.put(20, "kumar");
    hm.put(20, "kumar");


  //   for (Map.Entry<Integer, String> entry : hm.entrySet()) {
  //     System.out.println(entry.getKey() + " ---" + entry.getValue());
  // }

  System.out.println(hm);
    
  }
  
}

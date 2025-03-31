// package Collections.Arraylist.java;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(12);
        arrList.add(42);
        arrList.add(62);
        arrList.add(52);

        arrList.set(1,60);
        System.out.println(arrList.indexOf(52));
      

        // System.out.println(arrList);

        // for(int x : arrList){
        //     System.out.println(x);
        // }

        ListIterator<Integer> it =  arrList.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        



    }
    
}

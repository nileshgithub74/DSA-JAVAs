import java.util.Stack;
public class InsertAtIndex {

    public static void insert(int index, int element, Stack<Integer> st){

        Stack<Integer> temp = new Stack<>();
        int size = st.size();

        for(int i =0;  i < size- index; i++){
            temp.push(st.pop());

        }

        st.push(element);

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        



    }



    public static void detelte(Stack<Integer> st , int index){
        int size = st.size();
        Stack<Integer> temp = new Stack<>();

        for(int i =0;i <size- index; i++){
            temp.push(st.pop());
        }

        st.pop();

        while (!temp.isEmpty()) {
            st.push(temp.pop());
            
        }
    }





    public static void main(String[] args){

     Stack<Integer> st = new Stack<>();
     st.push(10);
     st.push(20);
     st.push(30);

     System.out.print(st+ " ");

     insert(2,45, st);
        System.out.println("After Insertion: " + st);

        detelte(st, 3);

          System.out.println("After deletion: " + st);
     
    




    }
    
}

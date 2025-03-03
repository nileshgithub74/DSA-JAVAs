public class CheckedArraySorted {

    public static void  main(String[] args){
        int[] arr = {1,3,4,51,6,78,433};

        boolean ans = false;


        for(int i=0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                ans = false;
                break;
            }
        }
       
        System.out.print(ans);

    }

    

    
}

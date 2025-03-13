public class LeftRotateArrayByOne {
    public static void main(String[] args){


        int[] arr = { 20, 30, 40 , 50 , 60};
   
        for(int i=1; i< arr.length; i++){
            arr[i-1] = arr[i];  

        }
        arr[arr.length-1] = arr[0];

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    
}

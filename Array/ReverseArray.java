public class ReverseArray{
    public static  void main(String[]  args){
        int[] arr = {12,23,4,7,3,43,5,543};


        // int[] reverseArray = new int[arr.length];

        // for(int i=0; i< arr.length; i++){
        //     reverseArray[i]  = arr[arr.length-1-i];



        // }
        // for(int x : reverseArray){
        //     System.out.print(x+" ");
        // }


        int i =0;
        int j = arr.length-1;

        while(i<j){
            int temp  = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }


        for(int x : arr){
            System.out.print(x+" ");
        }














    }
}
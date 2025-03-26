public class ThirdLargestElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,9,6,7};



        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;


        for(int i=0; i<arr.length; i++){
            if(arr[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];

            }else if( arr[i] > secondMax && firstMax!= arr[i]){
                thirdMax = secondMax;
                secondMax = arr[i];

            }else if( arr[i] > thirdMax &&  secondMax != arr[i]){
                thirdMax = arr[i];
            }



        }
    
        System.out.println("Third Element : "+ thirdMax);





        
    }
    
}

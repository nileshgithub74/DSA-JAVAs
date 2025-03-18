public class MaxSubarraySum {
    
    public static void main(String[] args) {
        int[] arr = { 2,3,-8,7,-1,2,3};


        int sum =0;
        int maxSum = arr[0];

        for(int i =0; i< arr.length; i++){
             sum += arr[i];

             maxSum = Math.max(sum, maxSum);
             if(sum < 0){
                sum =0;
            }
        }
      

        System.out.println(maxSum);
       


    }
}

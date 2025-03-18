public class MaxOddEvenSubArray {
    public static void main(String[] args) {
         int[] arr = {5,10,20,6,3,8};
         int n = arr.length;

         int count  =1; int result = 1;
         for(int i =1; i< n; i++){

            if(arr[i]%2 ==0 && arr[i-1]% 2!=0 ||  arr[i]%2 !=0 && arr[i-1]% 2==0 ){
                count++;
                result = Math.max(result, count);
            }
            else{
                count = 1;
            }

         }
         System.out.println(result);
    }
    
}

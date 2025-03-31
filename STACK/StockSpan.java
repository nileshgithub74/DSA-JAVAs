public class StockSpan {
    public static void main(String[] args) {

        int[] arr = { 13,15,12,14, 16, 8 ,6,4,10,30};

        
        for(int i =0 ; i< arr.length; i++){
            int span  =1;
        
            for(int j = i-1; j>=0; j--){
               if(arr[j] <= arr[i]){
                span++;
            
               }
             

            }
            System.out.print(span +" ");
               
              
            
          

        }
        

    }}
    


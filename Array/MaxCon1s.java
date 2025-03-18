public class MaxCon1s {
    public static void main (String[] args){
        int arr[] = { 1,0,1,1,1,1,0,1,1};
        int count = 0;
        int max = 0;

        for(int  i =1; i < arr.length; i++){
            if(arr[i] == 1){
                count++;

                max = Math.max(count, max);
            }else if(arr[i] ==0){
                count =0;
            }

        }
        System.out.println(max);
    }
    
}

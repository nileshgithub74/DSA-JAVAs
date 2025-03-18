
public class RainTrap {

   static   int getWater(int arr[]){
        int n = arr.length;
        int result =0;
        int[] leftMax = new int[arr.length];
        int[]  RightMax = new int[arr.length];

        leftMax[0] = arr[0];

        for(int i=1; i< arr.length-1; i++){
            leftMax[i]  =  Math.max(leftMax[i-1], arr[i]);
        }

        RightMax[n-1] = arr[n-1];

        for(int i = arr.length-2; i>=0; i--){
            RightMax[i] = Math.max(RightMax[i+1], arr[i]);
        }
      

        for(int  i =1; i< arr.length; i++){
            result += (Math.min(leftMax[i], RightMax[i])  - arr[i]);
        }

        return  result;

    }


    public static void main(String[] args){

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int ans =  getWater(height);
        System.out.println(ans);
        

        

    }
    
}

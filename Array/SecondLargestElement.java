
// class SecondLargestELement{



//     static  int largestElement(int[] arr){
//     int max= arr[0];
//         for(int i =0; i < arr.length; i++){
//             if(arr[i]> max){
//                 max  = arr[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args){
//         int arr[] = {2,4,5,6,73,3,24,24};


//         int largestnum =  largestElement(arr);


//         for(int i =0 ; i< arr.length; i++){
//             if(arr[i] == largestnum){
//                 arr[i]  = Integer.MIN_VALUE;
//             }
//         }

//         int secondnum  = largestElement(arr);
//         System.out.println("second Num : "+ secondnum);



//     }
// }



// class SecondLargestELement{
//     public static void main(String[] args) {
//         int[] arr = {2,4,5,3,453,43,53};

//         int max1 = arr[0];
//         int max2 = arr[0];

//         for(int i =1; i< arr.length; i++ ){
//             if(arr[i] > max1 ){
//                 max2 = max1;
//                 max1 = arr[i];
                
//             }else if(arr[i]> max2){
//                 max2 = arr[i];
//             }
//         }

//         System.out.println(max2);


        
// }


// }
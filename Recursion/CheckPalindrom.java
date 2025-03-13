package Recursion;

public class CheckPalindrom {


    // static  boolean  checkPalindrome(String str){
    //     int left  =0;
    //     int right = str.length()-1;

    //     while (left > right) {

    //         if(str.charAt(left) != str.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
            
    //     }
    //     return true;
    // }


    static boolean    checkPalindrome(String s, int left, int right){
        if(left >= right) return  true;


        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return  checkPalindrome(s, left+1 , right-1);

    }

 



    public static void main(String[] args){

    String str = "Nilesh";
    int start =0;
    int  end = str.length()-1;

    System.out.println(checkPalindrome(str,start, end ));

    

    






    }
    
}

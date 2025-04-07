package StrDemo;

public class Palindrome {
    public static void  main(String[] args){
        String str  = " madam";


        // StringBuilder sb = new StringBuilder(str);
        // sb.reverse();

        // System.out.println(str.equals(sb.toString()));

        int i = 0;
        int j = str.length() -1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j) ){
           System.out.println("not palindrome");
           return ;

        }
        else{
            i++;
            j--;
        }
        System.out.println("Palindrome");

        }

    }
    
}
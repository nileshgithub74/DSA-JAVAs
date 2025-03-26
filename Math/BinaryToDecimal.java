// // import java.util.*;

// // public class BinaryToDecimal{
// //   public static void main(String[] args){
// //     Scanner sc = new Scanner(System.in);
// //     System.out.println("Enter the Numbers : ");
// //     int n  = sc.nextInt();

// //     int ans = 0;

// //      int power = 1;

// //      while(n>0){
// //       int unit_digit = n%10;
// //       ans +=(unit_digit * power);

// //       power = power*2;

// //       n=n/10;

// //      }
// //      System.out.print("Decimal Equivalent :"+ ans);
// //      sc.close();

// //   }

// // }

// import java.util.*;

// public class BinaryToDecimal {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the Binary value:");

//     String number = sc.nextLine();

//     int Decimal = Integer.parseInt(number, 2);
//     String octal = Integer.toOctalString(Decimal);
//     String hexa = Integer.toHexString(Decimal).toUpperCase();

//     System.out.println("Decimal: "+ Decimal);
//     System.out.println("Octal: " + octal);
//     System.out.println("Hexadecimal: " + hexa);



//     ////----------------------------- to conveert the int to string..

//     int a = 12323424; 
//     String num = a + "";
//     System.out.println(num);

//     String numbers = Integer.toString(a);   
//     System.out.println(numbers);

//   }
// }

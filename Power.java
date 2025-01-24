 public class Power{

  static long  FastPower(long a, long b){
     if(b ==0){
      return 1;


     }

     long half = FastPower(a, b/2);

     if(b%2==0){
      return (half *half);


      
     }

     return (half* half*a);
  }
  public static void main(String[] args){

    System.out.println(FastPower(3,10 ));

  }
 }
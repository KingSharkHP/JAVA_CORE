import java.util.Scanner;
public class PrimeNumber{
  public static boolean findPrimeNumber(long n){
    if(n == 1) 
    return false;
    for(long i = 2; i <= Math.sqrt(n); i++){
      if(n % i == 0) 
      return false;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n;
    n = Long.parseLong(scan.nextLine());
    if(findPrimeNumber(n))
      System.out.println("True");
    else
      System.out.println("False");
    scan.close();
  }
}

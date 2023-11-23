package PR1.Tutorial02;
import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter your a: " + a);
        int b = input.nextInt();
        System.out.println("Enter your a: " + b);
        int c = input.nextInt();
        System.out.println("Enter your a: " + c);
        if (a > b && a > c){
            System.out.println("The biggest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The biggest number is: " + b);
        } else {
            System.out.println("The biggest number is: " + c);
        }
        input.close();
    }
}

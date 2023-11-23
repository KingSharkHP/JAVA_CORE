package PR1.Tutorial02;
import java.util.Scanner;
public class ReadFloatNumer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        System.out.println("Enter your number: " + number);
        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            if (number < 1) {
                System.out.println("Small positive");
            } else if (number > 1000) {
                System.out.println("Large positive");
            } else {
                System.out.println("Positive");
            }
        } else {
            if (number > -1) {
                System.out.println("Small negative");
            } else if (number < -1000) {
                System.out.println("Large negative");
            } else {
                System.out.println("Negative");
            }
        }
        input.close();
    }
}

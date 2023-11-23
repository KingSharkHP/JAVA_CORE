package PR1.Tutorial03;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("Enter your weight (kg): " + a);
        double b = input.nextDouble();
        System.out.println("Enter your weight (m2): " + b);
        double BMI = a / b;
        System.out.println("Your BMI: " + BMI + "(kg/m2)");
        input.close();
    }
}
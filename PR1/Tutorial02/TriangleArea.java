package PR1.Tutorial02;
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("The triangle's base is " + h + " (cm)" + "and height is " + b + "(cm)");
        double A = (h*b) / 2;
        System.out.println("Its area (cm2) is: " + A);
        input.close();
    }
}

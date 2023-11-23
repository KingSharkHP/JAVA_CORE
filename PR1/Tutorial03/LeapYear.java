package PR1.Tutorial03;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year: ");
        double year = input.nextDouble();
        if(year % 4 == 0){
            if(year % 100 == 0) {
                if(year % 400 == 0){
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }
            } else {
                System.out.println("It's a leap year");
            }
        } else {
            System.out.println("It's not a leap year");
        }
        input.close();
    }
}

package PR1.Tutorial03;
import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age = input.nextDouble();
        if(age < 13 ) {
            System.out.println("You're too young");
        }
        else if(age >= 13 && age  <= 19){
            System.out.println("Welcome,teenager");
        } else {
            System.out.println("Welcome,teenager");
        }
        input.close();
    }
}

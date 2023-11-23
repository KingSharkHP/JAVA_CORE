package CodeTeen;
import java.util.Scanner;
public class Activity02 {
    public static boolean isValid(String s) {
        String myString = " ";
            if(myString == "()"){
                System.out.println("True");
               }   else if(myString == "[]"){
                    System.out.println("True");
                } else if (myString == "{}"){
                    System.out.println("true");
                }  
                else {
                    System.out.println("false");
                }
                return isValid(myString);
            }
        
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your character: " );
        String myString = input.nextLine();
        System.out.println(isValid(myString));
        input.close();
    }
}

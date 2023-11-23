import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a number between 1,000 and 999,999: ");
                userInput = Integer.parseInt(input.nextLine());

                if (userInput >= 1000 && userInput <= 999999) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number within the specified range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        String formattedNumber = String.format("%,d", userInput);
        System.out.println("Formatted Number: " + formattedNumber);
        input.close();
    }
}


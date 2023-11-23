import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a new password: ");
        String password = input.nextLine();
        
        int score = calculatePasswordStrength(password);
        
        System.out.print("Strength: " + score + " (");
        if (score <= 2) {
            System.out.println("weak)");
        } else if (score <= 4) {
            System.out.println("medium)");
        } else {
            System.out.println("strong)");
            input.close();
        }
    }
    
    public static int calculatePasswordStrength(String password) {
        int score = 0;

        // Check length
        int length = password.length();
        if (length >= 8 && length <= 12) {
            score += 1;
        } else if (length > 12) {
            score += 2;
        }

        // Check for uppercase letter
        if (password.matches(".*[A-Z].*")) {
            score += 1;
        }

        // Check for lowercase letter
        if (password.matches(".*[a-z].*")) {
            score += 1;
        }

        // Check for digit
        if (password.matches(".*\\d.*")) {
            score += 1;
        }

        // Check for non-alphanumeric characters
        if (password.matches(".*[^a-zA-Z0-9].*")) {
            score += 1;
        }

        return score;
    }
}




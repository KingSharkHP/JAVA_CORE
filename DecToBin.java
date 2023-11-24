package PR1.Tutorial05;
import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = toBinary(decimal);
        System.out.println("Binary representation: " + binary);
    }

    public static String toBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryString.append(remainder); 
            decimal = decimal / 2;
        }

        return binaryString.reverse().toString(); // Reverse the binary string to get the correct order
    }
}

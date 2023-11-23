import java.util.Scanner;

class RecursiveStringReverse {
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Reversed string: " + reverse(s));
        input.close();
    }
}

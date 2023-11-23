package OOP;
import java.util.Scanner;

public class Activity01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi ký tự: ");
        String inputString = scanner.nextLine();

        String[] elements = inputString.split(" ");

        System.out.println("Mảng sau khi chia:");
        String result = String.join(",", elements);
        System.out.println(result);
        scanner.close();
    }
}





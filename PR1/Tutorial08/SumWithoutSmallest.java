package PR1.Tutorial01.Tutorial02.Tutorial08;
import java.util.ArrayList;
import java.util.Scanner;

public class SumWithoutSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        ArrayList<Integer> arrList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arrList.add(input.nextInt());
        }

        int sum = 0;
        int smallest = arrList.get(0);

        // Tính tổng của các phần tử trong mảng
        for (int i : arrList) {
            sum += i;
        }
        System.out.println("Sum of the array is: " + sum);

        // Tìm phần tử nhỏ nhất trong mảng
        for (int a : arrList) {
            if (a < smallest) {
                smallest = a;
            }
        }
        System.out.println("The smallest element in the array is " + smallest);
        int sumWithoutSmallest = sum - smallest;
        System.out.println("The sum without the smallest element is " + sumWithoutSmallest);
        input.close();
    }
}
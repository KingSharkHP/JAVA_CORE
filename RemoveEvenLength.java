import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenLength {
    public static void removeEvenLength(ArrayList<String> arrList) {
        int index = 0;
        while (index < arrList.size()) {
            if (arrList.get(index).length() % 2 == 0) {
                arrList.remove(index);
            } else {
                index++;
            }
        }
        System.out.println(arrList);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list: ");
        int n = input.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arrayList.add(input.next());
        }

        System.out.println("Original list: " + arrayList);
        removeEvenLength(arrayList);
        input.close();
    }
}

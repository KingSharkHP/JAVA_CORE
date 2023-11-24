package PR1.Tutorial05;
import java.util.Scanner;

public class FloatArrayInspect {

    public static int findSmallest(int[] arr) {
        int min = arr[0];  
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  
            }
        }
        return min;
    }
    public static int findBiggest(int[] arr) {
        int max = arr[0];  
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n]; 
        
        int smallest = findSmallest(arr); 
        int biggest = findBiggest(arr);
        System.out.println("The smallest element in the array is: " + smallest + "The biggest number is " + biggest);
        input.close();
    }
}

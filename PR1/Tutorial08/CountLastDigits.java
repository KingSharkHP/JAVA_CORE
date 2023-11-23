public class CountLastDigits {
    public static int[] countLastDigits(int[] arr) {
        int[] counts = new int[10]; // An array to store counts for digits 0 to 9

        for (int num : arr) {
            int lastDigit = Math.abs(num) % 10; // Get the last digit using modulo 10

            counts[lastDigit]++; // Increment the count for the corresponding digit
        }

        return counts;
    }
}

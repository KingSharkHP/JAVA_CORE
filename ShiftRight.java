public class ShiftRight {
    public class ArrayShift {
        public static void shiftRight(int[] arr) {
            if (arr.length <= 1) {
                return; // If array has 0 or 1 element, no need to shift
            }
    
            int lastElement = arr[arr.length - 1]; // Store the last element
    
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i]; // Shift elements to the right
            }
    
            arr[0] = lastElement; // Move the last element to the front
        }
    }
    
}

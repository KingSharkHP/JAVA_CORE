public class RecursiveDec2Bin {
    public static String toBinary(int n){
        if(n == 0) {
            return "0";
        }else if (n == 1) {
            return "1";
        }   else {
            return toBinary(n/2) + (n%2);
        }
    }
    public static void main(String[] args) {
        System.out.println(toBinary(75));
    }
}


    




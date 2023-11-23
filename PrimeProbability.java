import java.util.Random;

public class PrimeProbability {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int totalNumbers = 100;

        for (int i = 0; i < totalNumbers; i++) {
            int randomNumber = random.nextInt(999) + 2; 
            if (isPrime(randomNumber)) {
                count++;
            }
        }

        double probability = (double) count / totalNumbers * 100;
        System.out.println("Among " + totalNumbers + " random integers, " + count + " are prime numbers");
        System.out.println("Probability is " + probability + "%");
    }
}


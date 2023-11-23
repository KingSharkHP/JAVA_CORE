package PR1.Tutorial02;
public class CoinConverter {
    public static void main(String[] args) {
        int totalXu = 483274;

        int quan = totalXu / (100 * 10 * 10); // Number of quan
        int remainingXu = totalXu % (100 * 10 * 10);

        int dong = remainingXu / (10 * 10); // Number of dong
        remainingXu %= (10 * 10);

        int hao = remainingXu / 10; // Number of hao
        int xu = remainingXu % 10; // Remaining xu

        System.out.println(totalXu + " xu converts into:");
        System.out.println(quan + " quan, " + dong + " dong, " + hao + " hao, " + xu + " xu");
    }
}


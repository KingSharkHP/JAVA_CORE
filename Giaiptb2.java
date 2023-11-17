public class Giaiptb2 {
    public static String GiaiPtb2(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "PT bac nhat vo so nghiem";
            } else if (b == 0 && c != 0) {
                return "PT vo nghiem";
            } else {
                return "PT co 1 nghiem la " + (-c / b);
            }
        } else {
            if (delta == 0) {
                return "Phuong trinh co 1 nghiem la " + (-b / (2 * a));
            } else if (delta < 0) {
                return "Phuong trinh vo nghiem";
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "PT co 2 nghiem la " + x1 + " and " + x2;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(GiaiPtb2(1, 2, -3));
    }
}


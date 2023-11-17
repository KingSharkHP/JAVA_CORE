public class Activity1 {
    public static void main(String[] args){
        boolean a = true;
        boolean b = !a;
        boolean c = a || b;
        boolean d = a && b;
        boolean e = d ? b : c;  
        System.out.println(d + " " + e);
    }
}

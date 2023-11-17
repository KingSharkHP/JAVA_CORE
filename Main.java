import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>(10);
        obj.add("C++");
        obj.add("Python");
        obj.add("Java");
        obj.add("Javascript");
        for (String arr: obj) {
            System.out.println(arr);
        }
    }
}

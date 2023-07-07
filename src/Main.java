import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List ki = new ArrayList();
        ArrayList list = new ArrayList();
        ki.add(111);
        ki.add(1);
        ki.add("deng");
        System.out.println(ki);
        ki.remove(Integer.valueOf(1));
        System.out.println(ki);
    }
}
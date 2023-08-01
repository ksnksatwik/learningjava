import java.util.*;

public class Demo2 {
    private static final boolean True = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statanory obj = new Statanory();
        obj.pen();
        obj.Scale();
        obj.book();
        obj.box();

        System.out.println("Aal Bal\t" + obj.money);

    }
}


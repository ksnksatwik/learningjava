import java.util.*;

public class Exe2_1 {
    public static void main(String[] args) {
        // creating object of the Calculater Class
        calculator object = new calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println(object.add(num1, num2));
        System.out.println(object.sub(50, 34));

    }

}

class calculator {

    public int add(int n, int m) {
        System.out.println("in add");
        return (n + m);

    }

    public int sub(int n, int m) {
        System.out.println("in sub meathod ");
        return (n - m);

    }
}
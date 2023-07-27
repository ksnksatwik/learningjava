public class Demo {
    public static void main(String[] args) {
        int n = 144;
        int m = 100;
        Calc obj = new Calc();
        System.out.println(obj.add(n, m));
        System.out.println(obj.sub(n, m));
    }

}

class Calc {
    int a = 10;

    public int add(int n, int m) {
        return n + m;
    }

    public int sub(int n, int m) {
        return n - m;
    }
}
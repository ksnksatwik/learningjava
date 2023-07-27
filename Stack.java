public class Stack {

    public static void main(String[] args) {
        int n = 10, m = 13;
        Heap foo = new Heap();
        foo.setX(2083);
        System.out.println(foo.add(n, m));
    }
}

/**
 * Heap
 */
class Heap {

    public static int x = 10;

    public static int add(int n, int m) {
        return n + x;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
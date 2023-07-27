/**
 * constructor overriding
 */
public class Demo3 {
    public static void main(String[] args) {
        calc foo = new calc();

        System.out.println(foo.add(12, 13));
        System.out.println(foo.add(23, 232, 322));
    }

}

/**
 * calc
 * public add(int x,int y,int z){
 * return x+y;}
 */

class calc {
    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public int add(int x, int y) {
        return x + y;
    }

}

class A {
    public A() {
        System.out.println("in a");
    }

}

/**
 * b
 */
class B extends A {
    public B() {
        System.out.println("in b");
    }

}

public class Demo {
    public static void main(String[] args) {
        B foo = new B();
    }

}

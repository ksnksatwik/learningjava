class Stac {
    public static void main(String[] args) {
        Mobile s1 = new Mobile();
        s1.brand = "Samsung ";
        s1.modal = "a50";
        s1.name = "Smart phone";
        s1.price = 25000;
        s1.show();
        Mobile s2 = new Mobile();
        s2.brand = "Samsung ";
        s2.modal = "a50";
        s2.name = "Smart phone";
        s2.price = 22000;
        s2.show();
        Mobile s3 = new Mobile();
        s3.brand = "redmi ";
        s3.modal = "k20 pro";

        s3.price = 30000;
        s3.show();
        Mobile s4 = new Mobile();
        s4.brand = "apple";
        s4.modal = "xr";

        s4.price = 35000;
        s4.show();
        Mobile s5 = new Mobile();
        s5.brand = "apple";
        s5.modal = "13";

        s5.price = 73000;
        s5.show();
        Mobile s6 = new Mobile();
        s6.brand = "Samsung ";
        s6.modal = "a73";

        s6.price = 43000;
        s6.show();
        Mobile s7 = new Mobile();
        s7.brand = "Samsung ";
        s7.modal = "s21fe";
        s7.name = "Smart phone";
        s7.price = 30000;
        s7.show();
        Mobile s8 = new Mobile();
        s8.brand = "Samsung ";
        s8.modal = "m31";
        s8.name = "Smart phone";
        s8.price = 13000;
        s8.show();
    }
}

/**
 * Mobile
 * 
 * String name;
 * int price;
 * String brand;
 * String modal;
 */
class Mobile {
    static String name;
    int price;
    String brand;
    String modal;
    static int spend;

    public void show() {
        spend = spend + price;

        System.out.println(name + " : " + brand + " " + modal + " : " + price + " total spending:- " + spend);

    }

}
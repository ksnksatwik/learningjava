/**
 * Human
 */
class Human {

    private String name;
    private int age;

    public Human() {
        this.name = "ksnksatwik";
        this.age = 18;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Set_name(String name) {
        this.name = name;

    }

    public String getname() {
        return this.name;
    }

    public void Set_age(int age) {
        this.age = age;
    }

    public int get_age() {
        return this.age;
    }

}

public class Encap {
    public static void main(String[] args) {
        Human obj = new Human("ksnks", 12);
        Human obj1 = new Human();
        // encapsulation - hiding the implementation details of an object from outside
        // access
        System.out.println("Before setting value");
        System.out.println("Name: " + obj.getname());// accessing using getter method
        System.out.println("Age :" + obj.get_age());
        obj.Set_name("satwik"); // setting values through setter methods
        obj.Set_age(22);
        System.out.println("\nAfter Setting Value:");
        System.out.println("Name:" + obj.getname()); // getting updated data
        System.out.println("Age :" + obj.get_age());

        System.out.println("Before setting value");
        System.out.println("Name: " + obj1.getname());// accessing using getter method
        System.out.println("Age :" + obj1.get_age());
        obj.Set_name("satwik"); // setting values through setter methods
        obj.Set_age(22);
        System.out.println("\nAfter Setting Value:");
        System.out.println("Name:" + obj1.getname()); // getting updated data
        System.out.println("Age :" + obj1.get_age());

    }

}

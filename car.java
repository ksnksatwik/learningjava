class Car {
    public static void main(String[] args) {
        Bmw obj = new Bmw();
        System.out.println("Before starting the car: " + obj.s);
        obj.start();
        System.out.println("After starting the car: " + obj.s);
        obj.abreak();
        System.out.println("After breaking the car: " + obj.getS());
        obj.rbreak();
        System.out.println("After re-starting the car again:" + obj.s);

    }

}

class Bmw {
    public String s = "statanory";

    public void start() {
        s = "running";
        System.out.println("car is starting.....");

    }

    public void abreak() {
        s = "statanory";
        System.out.println("breaking....");
    }

    public void rbreak() {
        s = "running";
        System.out.println("re-starting......");

    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
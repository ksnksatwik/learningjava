import java.util.*;

public class Demo2 {
    private static final boolean True = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        statanory obj = new statanory();
        obj.pen();
        obj.Scale();
        obj.book();
        obj.box();

        System.out.println("Aal Bal\t" + obj.money);

    }
}

class statanory {
    public int money = 101;

    public void pen() {
        int pen_cost = 10;
        if (money >= pen_cost) {
            System.out.println("pen bought");
            money -= pen_cost;
        } else {
            System.out.println("Sorry, you don't have enough balance to buy the pen.");
        }
    }

    public void Scale() {
        int scale_cost = 12;
        if (money >= scale_cost) {
            System.out.println("scale bought");
            money -= scale_cost;
        } else {
            System.out.println("Sorry, you don't have enough balance to buy the scale.");
        }
    }

    public void box() {
        int box_cost = 120;
        if (money >= box_cost) {
            System.out.println("box bought");
            money -= box_cost;
        } else {
            System.out.println("Sorry, you don't have enough balance to buy the ox.");
        }
    }

    public void book() {
        int book_cost = 45;
        if (money >= book_cost) {
            System.out.println("book bought");
            money -= book_cost;
        } else {
            System.out.println("Sorry, you don't have enough balance to buy the ox.");
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

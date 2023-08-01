class Demo {
    int roll;
    String name;
    int marks;
}

class Enhloop {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.roll = 1;
        obj.name = "siva ";
        obj.marks = 12;
        Demo obj1 = new Demo();
        obj1.roll = 2;
        obj1.name = "satwik";
        obj1.marks = 20;
        Demo obj2 = new Demo();
        obj2.roll = 3;
        obj2.name = "kalyan";
        obj2.marks = 30;
        Demo tes[] = new Demo[3];
        tes[0] = obj;
        tes[1] = obj1;
        tes[2] = obj2;
        for (int i = 0; i < tes.length; i++) {
            System.out.println(tes[i].name + " : " + tes[i].roll);
        }

    }
}
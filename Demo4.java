public class Demo4 {

    public static void main(String[] args) {
        Test OBJ = new Test(12, "ksnksatwik");
        Test OBJ1 = new Test(13, "siva");

        System.out.println(OBJ.Name + " " + OBJ.id);
        System.out.print(OBJ1.Name + " " + OBJ1.id);

    }
}

/**
 * Test
 * 
 * void Test(){
 * }
 */
class Test {
    int id;
    String Name;

    Test() {
        System.out.println("in constrcutor");

    }

    Test(int n, String m) {
        this.id = n;
        this.Name = m;

    }

    void Goa() {
        System.out.println(" in goa");
    }

}
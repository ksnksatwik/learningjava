public class Exe1 {
    public static void main(String[] args) {
        System.out.println("hello");
        int x = 5;
        double y = 3.4, z = -20.6789;
        boolean isTrue = true;
        char letter = 'A';
        String name = "John";
        
        System.out.printf("%d %f %.3f\n",x,y,z);
        
        if (isTrue)
        {
            System.out.print("\tThis statement will execute.");
        }
        else 
        {
            System.out.print("\tThis one won't!");
        }
        
        
        for (int i = 0; i < name.length(); ++i)
        {
            System.out.print((char) (letter + i));
        }
        
        while (!name.isEmpty()) 
        {
            System.out.print(name + " ");
            break;
        }

    }

}
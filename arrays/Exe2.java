package arras;

/**
 * Exe2
 */

public class Exe2 {

    public static void main(String[] args) {
        int n[]= new int[10];
        int c=0;
        for(int i=0;i<=100;i++){
            n[i]=i;
            c=i;
        }
        System.out.println(n);
        arrays foo = new arrays();
        foo.print_arrays(n, c);
        
        

    }
}
/**
 * arras
 
 */
class arrays {
    public void print_arrays(int n[],int x){
        for(int i=0;i<=x;i++){
            System.out.println(n[i]);
        }
    }


    
}
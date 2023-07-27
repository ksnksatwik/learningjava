package arras;

/**
 * Exe3
 */
public class Exe3 {

    public static void main(String args[]) {
        int x = 25;
        int a[][] = new int[x][x];
        // assigning values
        /**
         * for (int i = 0; i < x; i++) {
         * for (int j = 0; j < x; j++) {
         * a[i][j] = j+1;
         * }
         * }
         */
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        // printing values
        /**
         * for (int i = 0; i < x; i++) {
         * for (int j = 0; j < x; j++) {
         * System.out.print(a[i][j] + " ");
         * }
         * System.out.println(" ");
         * System.out.println(" ");
         * }
         */
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + " ");

            }
            System.out.println(" ");
            System.out.println(" ");
        }

    }
}

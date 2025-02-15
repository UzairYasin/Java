package DSA.Patterns;

public class DiamondPattern {
    
    public static void main(String[] args) {

        int n = 4;

        for (int i = 0; i < n; i++) {
            int spaces = n-i;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            int spaces = n-i;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}

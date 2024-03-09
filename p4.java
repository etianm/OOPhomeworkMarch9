import java.util.Scanner;

public class TreiNumere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int A = scanner.nextInt();

        System.out.print("B: ");
        int B = scanner.nextInt();

        System.out.print("C: ");
        int C = scanner.nextInt();

        if (A < B && A < C) {
            System.out.println("Valoarea minima: " + A);
        } else if (B < A && B < C) {
            System.out.println("Valoarea minima: " + B);
        } else if (C < A && C < B) {
            System.out.println("Valoarea minima: " + C);
        } else if (C < A && C == B) {
            System.out.println("Valoarea minima: " + C);
        } else if (C < B && C == A) {
            System.out.println("Valoarea minima: " + A);
        } else if (B < C && B == A) {
            System.out.println("Valoarea minima: " + B);
        }
        scanner.close();
    }
}

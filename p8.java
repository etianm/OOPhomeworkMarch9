import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();

        int factorial = 0;
        int numar = 1;  

        for (int i = 0; i < n; i++) {
            factorial *= numar;
            numar += 1;  
        }
        System.out.println("Factorialul lui " + n + " este: " + factorial);

        scanner.close();
    }
}

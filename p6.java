import java.util.Scanner;

public class SumaNumereImpare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();

        int suma = 0;
        int numar = 1;  

        for (int i = 0; i < n; i++) {
            suma += numar;
            numar += 2;  
        }
        System.out.println("Suma primelor " + n + " numere impare este: " + suma);

        scanner.close();
    }
}

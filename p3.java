import java.util.Scanner;

public class OperatiiNumerice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int numar1 = scanner.nextInt();

        System.out.print("B: ");
        int numar2 = scanner.nextInt();

        if (numar1 % 2 == 0 && numar2 % 2 == 0) {
            double mediaAritmetica = (numar1 + numar2) / 2.0;
            System.out.println("Media aritmetica este: " + mediaAritmetica);
        } else if (numar1 % 2 != 0 && numar2 % 2 != 0) {
            int produs = numar1 * numar2;
            System.out.println("Produsul este: " + produs);
        } else {
            int suma = numar1 + numar2;
            System.out.println("Suma este: " + suma);
        }
        scanner.close();
    }
}

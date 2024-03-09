import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();

        int suma = 0;
        int numar = 1;  

        for (int i = 0; i < n; i++) {
            suma += numar;
            numar += 1;  
        }
        System.out.println("Media aritmetica celor " + n + " numere este: " + suma/n);

        scanner.close();
    }
}

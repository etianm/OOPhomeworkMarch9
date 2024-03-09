import java.util.Scanner;

public class AdmissionStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota/Media: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("INVALID");
        } else if (number > 5) {
            System.out.println("ADMIS");
        } else {
            System.out.println("RESPINS");
        }
    }
}
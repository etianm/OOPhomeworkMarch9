import java.util.Scanner;

public class Cifre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numar: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 5) {
            System.out.println("INVALID");
        } else if (number == 1) {
            System.out.println("UNU");
        } else if (number == 2) {
            System.out.println("DOI");
        } else if (number == 3) {
            System.out.println("TREI");
        } else if (number == 4) {
            System.out.println("PATRU");
        } else if (number == 5) {
            System.out.println("CINCI");
        } 
    }
}
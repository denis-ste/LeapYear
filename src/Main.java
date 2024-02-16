import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        int year = 0;
        String exit = "n";

        do {
            System.out.println("\nWprowadz rok by sparwdzić czy jest przestępny: ");

            do try {
                again = true;
                year = scanner.nextInt();
                scanner.nextLine();
                again = false;
            } catch (InputMismatchException error) {
                System.out.println("\nNiewłaściwy format roku spróbuj ponownie");
                scanner.nextLine();
            } while(again);

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Rok jest przestępny");
                    } else System.out.println("Rok nie jest przestępny");
                } else System.out.println("Rok jest przestępny");
            } else System.out.println("Błąd krytyczny nie uwzgedniono warunku!!!");

            do {
                System.out.println("Exit program? (y / n): ");
                exit = scanner.nextLine();
                if ( !(exit.equals("n") || exit.equals("y") )) {
                    System.out.println("Niewłaściwy format komendy spróbuj ponownie by zdecydować");
                }
            } while( !(exit.equals("n") || exit.equals("y")));

        } while (!exit.equals("y"));
    }
}


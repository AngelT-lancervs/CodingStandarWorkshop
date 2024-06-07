package labcodeinspection;

import java.util.Scanner;

/**
 * EmailApp is the main class to run the Email application.
 */
@SuppressWarnings("PMD.UseUtilityClass")
public class EmailApp {

    /**
     * The main method is the entry point of the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your first name: ");
            final String firstName = scanner.nextLine();

            System.out.print("Enter your last name: ");
            final String lastName = scanner.nextLine();

            System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

            int depChoice = scanner.nextInt();

            final Email email = new Email(firstName, lastName);
            email.generateEmail();
            email.showInfo();
        }
    }
}

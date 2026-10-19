import java.util.Scanner;

import static java.lang.IO.println;

public class FullNameApplication {
    static void main() {
        Scanner sc = new Scanner(System.in);
        println("Enter your name:");
        System.out.printf("First name: ");
        String firstName = sc.nextLine().trim();
        System.out.printf("Middle Name: ");
        String middleName = sc.nextLine().trim();
        System.out.printf("Last name: ");
        String lastName = sc.nextLine().trim();
        System.out.printf("Suffix: ");
        String suffix = sc.nextLine().trim();

        System.out.printf("Your name: %s %s %s%s%s",
                firstName,
                middleName,
                lastName,
                (suffix.isEmpty()) ? " " : ", ",
                suffix);
    }
}

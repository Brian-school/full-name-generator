import java.util.Scanner;

import static java.lang.IO.println;
import

public class full_name_parser {
    public static String [] remove(String [] arr, int whichIndex) {
        String [] newArr = new String[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == whichIndex) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            println("Please enter your names in either \"first last\" or \"First Middle Last\" format.");
            String [] names = sc.nextLine().trim().split(" ");

            // remove empty entries which were originally spaces trimmed and split
            // why does java not remove delimiters with "split"?
            OUTER:
            while (true) {
                boolean empty_found = false;
                INNER:
                for (int i = 0; i < names.length; i++) {
                    if (names[i].isEmpty()) {
                        empty_found = true;
                        names = remove(names, i);
                        break INNER;
                    }
                }

                if (!empty_found) {
                    break OUTER;
                }
            }

            if (names.length == 2) {
                System.out.printf("First Name: %s\nLast Name: %s",
                        names[0],
                        names[1]);
                break;
            } else if (names.length == 3) {
                System.out.printf("First Name: %s\nMiddle Name: %s\nLast Name: %s",
                        names[0],
                        names[1],
                        names[2]);
                break;
            } else {
                if (names.length > 3) {
                    println("I'm sorry. This program only accepts three names, first middle and last.\n" +
                            "If you have more than one middle or last names, please choose just one and use that.");
                } else if (names.length < 2) {
                    println("Please enter your first and last names at minimum.");
                }
            }
        }
    }
}

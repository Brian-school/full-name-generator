import java.util.Scanner;

import static java.lang.IO.println;

public class highscore_wins {
    static void main() {
        Scanner sc = new Scanner(System.in);
        final String majorSeparator = "\\|";
        final String minorSeparator = ":";
        while (true) {
            println("This program parses game scores based on the format team1:team2|team1score:team2score");
            System.out.printf("Enter the game score: ");

            String gameScore = sc.nextLine().trim();

            String [] namesAndScores = gameScore.split(majorSeparator);
            if (namesAndScores.length != 2) {
                println("Incorrect format!");
                continue;
            }

            String [] names = namesAndScores[0].split(minorSeparator);
            if (names.length != 2) {
                println("Incorrect format!");
                continue;
            }

            String [] scoresString = namesAndScores[1].split(minorSeparator);
            if (scoresString.length != 2) {
                println("Incorrect format!");
                continue;
            }
            int [] scores = {Integer.parseInt(scoresString[0]), Integer.parseInt(scoresString[1])};

            if (scores[0] < 0 || scores[1] < 0) {
                println("Invalid number! Score cannot be negative.");
                continue;
            }

            if (scores[0] > scores[1]) {
                println("Winner: " + names[0]);
            } else if (scores[0] < scores[1]) {
                println("Winner: " + names[1]);
            } else {
                println("Winner: TIE");
            }
            break;
        }

    }
}

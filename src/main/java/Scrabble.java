import java.util.Scanner;

public class Scrabble {
        /*
    (1 point)-A, E, I, O, U, L, N, S, T, R
    (2 points)-D, G
    (3 points)-B, C, M, P
    (4 points)-F, H, V, W, Y
    (5 points)-K
    (8 points)- J, X
    (10 points)-Q, Z
     */

    private int totalScore;
    private String word;

    public Scrabble(String word) {
        this.totalScore = totalScore;
        this.word = word;
    }

    public int calcScrabbleWord()
    {
        word = word.toUpperCase();
        char letter;
        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);

            if ((letter =='A'|| letter =='E'|| (letter == 'I') || (letter == 'O') || (letter == 'U') || (letter == 'L') || (letter == 'N') || (letter == 'R') || (letter == 'S') || (letter == 'T'))) {
                totalScore = totalScore +1;
            }

            if (letter =='G' || letter =='D') {
                totalScore = totalScore +2;
            }

            if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
                totalScore += 3;
            }
            if (letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y') {
                totalScore += 4;
            }
            if (letter == 'K') {
                totalScore += 5;
            }
            if (letter == 'J' || letter == 'X') {
                totalScore += 8;
            }
            if (letter == 'Q' || letter == 'Z') {
                totalScore += 10;
            }
            if (word.chars().anyMatch(c -> !Character.isAlphabetic(c))) {
                System.out.println("invalid entry try again");
                break;
            }



        }

        return(totalScore);

    }

    public int getTotalScore() {
        return totalScore;
    }
    public void printScore(){
        System.out.println("Your total score is " + word + ": " + totalScore);
    }
}


import java.util.Scanner;

public class Main {
    //User stories (Who, What, and Why)
    //As a <Scrabble Player>, I want to <calculate the score for a word in Scrabble Player> so that <I can win at Scrabble>

    /*
    (1 point)-A, E, I, O, U, L, N, S, T, R
    (2 points)-D, G
    (3 points)-B, C, M, P
    (4 points)-F, H, V, W, Y
    (5 points)-K
    (8 points)- J, X
    (10 points)-Q, Z
     */


    //if empty or one letter words --> 0 points

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a word for scrabble calculation");
        String userInput = input.nextLine();
        Scrabble newWord = new Scrabble(userInput);
        userInput = userInput.toUpperCase();
        newWord.calcScrabbleWord();
        newWord.printScore();

    }
}

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleTest {

    @org.junit.jupiter.api.Test
    void calcScrabbleWorldLong() {
        Scrabble newWord = new Scrabble("Impedimenta");
        assertEquals(18, newWord.calcScrabbleWord());
    }

    @org.junit.jupiter.api.Test
    void calcScrabbleWorldShort() {
        Scrabble newWord = new Scrabble("The");
        assertEquals(6, newWord.calcScrabbleWord());
    }

    @org.junit.jupiter.api.Test
    void calcScrabbleWorldSingleLetter() {
        Scrabble newWord = new Scrabble("A");
        assertEquals(1, newWord.calcScrabbleWord());
    }

    @org.junit.jupiter.api.Test
    void calcScrabbleWorldOtherCharacter() {
        Scrabble newWord = new Scrabble("th-e");
        assertEquals(6, newWord.calcScrabbleWord());

    }

    @org.junit.jupiter.api.Test
    void calcScrabbleWorldSpace() {
        Scrabble newWord = new Scrabble("The The");
        assertEquals(12, newWord.calcScrabbleWord());
    }

    @org.junit.jupiter.api.Test
    void calcScrabbleWorldUpperCase() {
        Scrabble newWord = new Scrabble("THE");
        assertEquals(6, newWord.calcScrabbleWord());
    }

    @org.junit.jupiter.api.Test
    void calcScrabbleWorldLowerCase() {
        Scrabble newWord = new Scrabble("the");
        assertEquals(6, newWord.calcScrabbleWord());

    }
}
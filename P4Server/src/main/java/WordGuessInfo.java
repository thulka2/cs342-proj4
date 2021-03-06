import java.io.Serializable;

public class WordGuessInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    public int processCode;

    public boolean connected;

    // For current word guess
    public char guessedLetter;

    // If -1, the player did not guess letter
    public int letterLocation;

    public int guessesLeft;

    public String currentCategory;

    // These will indicate which category has been passed
    public boolean animalCategoryPassed;

    public boolean countryCategoryPassed;

    public boolean superheroCategoryPassed;

    public boolean gameOver;

    public WordGuessInfo() {
        super();
        this.connected = false;
        this.guessedLetter = '0';
        this.letterLocation = -1;
        this.guessesLeft = 6;
        this.currentCategory = null;
        this.animalCategoryPassed = false;
        this.countryCategoryPassed = false;
        this.superheroCategoryPassed = false;
        this.gameOver = false;

    }

}
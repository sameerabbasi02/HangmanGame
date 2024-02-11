public class HangmanMain {
    public static void main(String[] args) {

        // Step 1
        HangmanGame hangmanGameObj = new HangmanGame();
        HangmanView hangmanViewObj = new HangmanView();

        // Step 2
        hangmanViewObj.printScreen();

        // Step 3 & 4
        String difficulty = hangmanGameObj.selectDifficulty(hangmanViewObj.getInput("Would you like easy or hard words? "));
        System.out.println(difficulty);
        hangmanGameObj.initializeWords(difficulty);

        // Step 5
        hangmanGameObj.wordSelect();

        // Step 6
        hangmanViewObj.getZero();

        // Step 7
        hangmanGameObj.printWordProgress();

        // Step 8
        String guessInput = "";
        while (hangmanGameObj.finished == false) {
            guessInput = hangmanViewObj.getInput("Guess a letter: ");
            hangmanGameObj.guess(guessInput);
        }
    }
}

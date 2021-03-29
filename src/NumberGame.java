import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) throws Exception {
        // Generating random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100 + 1);

        // Game instruction
        System.out.println("Guess The Number Game");
        System.out.println("We generate a random number between 1 and 100");
        System.out.println("You have to guess the number within 10 chances to Win !");

        Scanner scanner = new Scanner(System.in);
        boolean hasWon = false;

        //
        for (int i=10; i>=1; i--){
            System.out.println("Make your guess ( "+ i + " chances left )");
            int guess = scanner.nextInt();
            if (randomNumber > guess){
                System.out.println("it is larger than "+ guess);
            }
            else if(randomNumber < guess){
                System.out.println("it is smaller than "+ guess);
            }
            else {
                hasWon = true;
                break;
            }
        }
        if (hasWon){
            System.out.println("YOU HAVE WON,THE NUMBER IS "+randomNumber);
        }
        else{
            System.out.println("YOU LOSE, GAME OVERS");
        }
    }
}

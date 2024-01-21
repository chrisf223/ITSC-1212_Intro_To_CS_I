import java.util.Scanner;

public class RPSGame {

    // 1 is Rock
    // 2 is Paper
    // 3 is Scissors

    public static void main(String[] args) {
        String startMessage = "****************************  START  *******************************\n";
        String endMessage = "\n****************************   END   *******************************\n";
        System.out.println(startMessage);

        Scanner scnr = new Scanner(System.in);
        //**************************** DO NOT MODIFY ANYTHING BEFORE THIS LINE ****************************

        // To-Do: Add print statement to welcome User to the game
        System.out.println("Welcome to rock paper scissors!");

        // To-Do: Add print statement prompting User to enter 1, 2, or 3 (explain which each number represents)
        System.out.println("Please enter 1 for rock, 2 for paper, and 3 for scissors");

        // To-Do: Use scnr.nextInt() to collect user input, save it as an int variable called choice
        int choice = scnr.nextInt();

        // To-Do: Complete the following line using Math.Random() to generate a int
        // In the range 1-3
        int computerChoice = (int)Math.random()*3+1;


        //**************************** DO NOT MODIFY ANYTHING BELOW THIS LINE ****************************
        playGame(choice, computerChoice);
        System.out.println(endMessage);
    }

    public static void playGame(int choice, int computerChoice) {
        // Print statements for User choice
        if (choice == 1) {
            System.out.println("User chose Rock");
        } else if (choice == 2) {
            System.out.println("User chose Paper");
        } else {
            System.out.println("User chose Scissors");
        }

        //Print statements for Computer choice
        if (computerChoice == 1) {
            System.out.println("Computer chose Rock.");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose Paper.");
        } else {
            System.out.println("Computer chose Scissors.");
        }
        
        // Determining the Winner
        if (computerChoice == choice) {
            System.out.println("It's a tie!");
        } else if (computerChoice == 1 && choice == 2) {
            System.out.println("Paper beats rock, Player wins!");
        } else if (computerChoice == 2 && choice == 1) {
            System.out.println("Paper beats rock, Player loses!");
        } else if (computerChoice == 2 && choice == 3) {
            System.out.println("Scissors beats paper, Player wins!");
        } else if (computerChoice == 3 && choice == 2) {
            System.out.println("Scissors beats paper, Player loses!");
        } else if (computerChoice == 1 && choice == 3) {
            System.out.println("Rock beats Scissors, Player loses!");
        } else if (computerChoice == 3 && choice == 1) {
            System.out.println("Rock beats Scissors, Player wins!");
        }
    }
}

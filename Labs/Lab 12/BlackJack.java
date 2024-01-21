import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) throws InterruptedException{
        BJDeck deck = new BJDeck();
        Scanner scnr = new Scanner(System.in);
        int loop = 1;
        int houseWins = 0;
        int playerWins = 0;
        int gameTies = 0;

        while (loop == 1) {
        int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);

        System.out.println("The House is showing " + houseTotal);
        Thread.sleep(500);

        while (playerTotal <= 21) {
            System.out.println("Player is showing: " + playerTotal);
            Thread.sleep(500);
            System.out.print("Would you like to hit or stand?\n\tEnter 1 for hit or 0 for stand: ");
            int choice = scnr.nextInt();
            if  (choice == 0) {
                break;
            } else if (choice == 1) {
                BJCard nextBJCard = deck.drawCard();
                System.out.println("Player draws the " + nextBJCard.declareCard());
                playerTotal += nextBJCard.getValue(true);
            } else {
                System.out.println("Invalid option, try again ");
            }
        } 
        Thread.sleep(500);

        if (playerTotal > 21) {
            System.out.println("The Player has busted!");
        } else {
            System.out.println("\nThe Player stands with " + playerTotal + " points.");
            System.out.println("The House will play next");
        while (houseTotal <= 21) {
            Thread.sleep(500);
            System.out.println("The House is showing " + houseTotal);
            if (houseTotal < 17){
                BJCard nextBJCard = deck.drawCard();
                System.out.println("House draws the " + nextBJCard.declareCard());
                houseTotal += nextBJCard.getValue(true);
            } else if (houseTotal >= 17 && houseTotal <=21) {
                System.out.println("The house will stand.");
                    break;
                }
            }
            Thread.sleep(500);

        if (houseTotal > 21) {
            System.out.println("The House has busted: The Player Wins.");
            Thread.sleep(500);
        }

        System.out.println(" ");
        System.out.println("Game Results!");
        Thread.sleep(500);

        if (houseTotal > playerTotal && houseTotal <= 21) {
            System.out.println("The House wins!");
        } else if (houseTotal < playerTotal && playerTotal <= 21) {
            System.out.println("The Player wins!");
        } else if (houseTotal == playerTotal) {
            System.out.println("It's a tie!");
        }

        }
        
        if ((houseTotal <= 21 && houseTotal > playerTotal) || playerTotal > 21){
            houseWins++;
        } else if ((playerTotal <= 21 && houseTotal < playerTotal) || houseTotal > 21){
            playerWins++;
        } else if (houseTotal == playerTotal){
            gameTies++;
        }
        System.out.println(" ");
        Thread.sleep(500);
        System.out.println("Standings!");
        Thread.sleep(500);
        System.out.println("House: " + houseWins);
        System.out.println("Player: " + playerWins);
        System.out.println("Ties: " + gameTies);
        Thread.sleep(1000);
        System.out.println(" ");

    }
        scnr.close();
    }
}

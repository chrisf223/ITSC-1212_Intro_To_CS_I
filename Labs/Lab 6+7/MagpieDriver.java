import java.util.Scanner;

public class MagpieDriver{
/**
 * Create a Magpie, give it user input, and print its replies.
 */
    public static void main(String[] args) {
        // for formatting output
        String startMessage = "****************************  START  *******************************\n";
        String endMessage = "\n****************************   END   *******************************\n";
        System.out.println(startMessage);

        // create an instance of the Chatbot
        Magpie maggie = new Magpie();
        // print the Chatbot's welcome message
        System.out.println(maggie.getGreeting());
        // create a Scanner instance for user input
        Scanner in = new Scanner(System.in);
        // read the user input
        String statement = in.nextLine();

        // set the chatbot to respond to user input 
        // as long as the user does not input the word bye
        while (!statement.equalsIgnoreCase("Bye")) {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
        // print closing messages
        System.out.println("Goodbye!");
        System.out.println(endMessage);

    }
}


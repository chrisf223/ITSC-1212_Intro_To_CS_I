import java.util.Scanner;

public class Business{

    static String companyName = "Deli";
    static String myName = "Chris";
    static String[] menuItems = {"Pizza","Hamburger","Chicken Fingers","Tacos","Fries"};
    static int menuNumbers = 5;

    public static void main(String[] args) {
        String decorativeLine = "****************************************";
        Scanner scnr = new Scanner(System.in);
        System.out.println(decorativeLine);

        System.out.println("Welcome to " + myName + "'s " + companyName + "!");
        System.out.print("I'm " + myName + ". What's your name? ");
        String customerName = scnr.next(); 
        System.out.println("Nice to meet you " + customerName + ".");
        System.out.println("Here's what we serve " + customerName + ". Please have a look.");
        
        for (int i = 0; i < menuNumbers; i++){
            System.out.println((i+1) + " " + menuItems[i]);
        }
        System.out.println("How many items would you like to order?: ");
        int numberOfItems = scnr.nextInt();
        int[] orderArray = new int[menuNumbers];
        
        for(int i=0; i < numberOfItems; i++){
            
            System.out.print("Please enter an item number from 1 to 5. ");
            orderArray[i] = scnr.nextInt();
            while (orderArray[i] < 0 || orderArray[i] > 5){
                System.out.println
            }
        }

       
        System.out.println(decorativeLine);
    }
  
    
        
    
}

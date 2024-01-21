public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
   public static void showDecaseconds(int numSeconds) {
    System.out.println("A decasecond is 10 sec");
    System.out.println(numSeconds + " seconds is: " + ((double)numSeconds/10)+ " decaseconds");
    System.out.println();
   }

    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    public static void showJiffies(int numSeconds) {
        System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds.");
        System.out.println(numSeconds + " seconds is: " + ((double)numSeconds*100)+ " Jiffies");
        System.out.println();
       }
    
    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here
    public static void showNewYorkMinutes(int numSeconds) {
        System.out.println("A new york minute is the period of time between the traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second.");
        System.out.println(numSeconds + " seconds is: " + ((double)numSeconds/20)+ " New York Minutes");
        System.out.println();
       }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here
    public static void showNanoCenturies(int numSeconds) {
        System.out.println("A nanocentury is a computing measurement coined from the expression - never to let the user wait more than a few nanocenturies for a response. It is 3.156 seconds.");
        System.out.println(numSeconds + " seconds is: " + ((double)numSeconds*3.156)+ " Nano Centuries");
        System.out.println();
       }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here
    public static void showScaramuccis(int numSeconds) {
        System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.");
        System.out.println(numSeconds + " seconds is: " + ((double)numSeconds/950400)+ " Scaramuccis");
        System.out.println();
       }




    
}//end class
public class Budget {
    public static void main(String[] args) {

        //Monthly Variables
        int rent = 625;
        int internet = 27;
        int groceries = 250;
        int leisure = 150;
        int totalCost = rent + internet + groceries + leisure;
        int savings = 100;
        int costAndSavings = totalCost + savings;
        int hourlyWage = 10;

        //Monthly Print Statements
        System.out.println("The student makes $" + hourlyWage + " an hour");
        System.out.println("Each month, rent costs: $" + rent);
        System.out.println("Each month, internet costs: $" + internet);
        System.out.println("Each month, groceries costs: $" + groceries);
        System.out.println("Each month, leisure costs: $" + leisure);
        System.out.println("Each month, the total expenses are: $" + totalCost);

        //Calculations
          //The total cost of all the expenses is divided by the hourly wage to determine the monthly quantity of hours needed to work, 
           //and then divided by 4 to determine the weekly quantity of hours needed to work.
        double breakEven = ((double)totalCost / (double)hourlyWage)/4;
          //The same steps as breakEven are applied with the additional $100 in savings being added. 
        double expensesWithSavings = ((double)costAndSavings / (double)hourlyWage)/4;
        //Calculations Print Statements
        System.out.println("To break even, the student would have to work: " + breakEven + " hours per week");
        System.out.println("To cover all expenses and save an extra 100 dollars a month, the student would have to work: " + expensesWithSavings + " hours per week");





    }


}
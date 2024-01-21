public class ITSC1212Lab2 {
    public static void main(String[] args){

        //Part A
        //short x = 0;
        //short y = 2000;
        //int z = 100000;
        //char a = 'a';
        //char b = 'b';
        //boolean boo = true;
        //System.out.println(x < y);
        //System.out.println(y > z);
        //System.out.println(z < a);
        //System.out.println();  


        //Part B
        // int ex = (int)4.0; 
        // System.out.println(ex);

        // double x = 8.8;
        // double y = 2.2;
        // System.out.println(x / y);
        // System.out.println(x / (int) y);
        // System.out.println((int) x / y);
        // System.out.println((int) (x/y));

        // double cost = 10.10;
        // double paid = 12.33;
        // double change = (int)(100* (paid - cost));
        // System.out.println("The change owed on this transaction is " + (double)change/100);


        //Part C
        int totalDays = 172;
        int years = totalDays/365;
        int weeks = (totalDays % 365)/7;
        int remainder = (totalDays % 365) % 7;
        System.out.println("Years " + years);
        System.out.println("Weeks " + weeks);
        System.out.println("Days " + remainder);
    }
}

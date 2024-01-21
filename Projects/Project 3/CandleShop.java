import java.util.Scanner;
public class CandleShop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter the name of the first candle: ");
        String nameOne = scnr.next();
        System.out.print("Please enter the type of the first candle: ");
        int typeOne = scnr.nextInt();
        System.out.print("Please enter the price of the first candle: ");
        double priceOne = scnr.nextDouble();
        System.out.print("Please enter the burn time of the first candle in minutes: ");
        int burnTimeOne = scnr.nextInt();

        System.out.print("Please enter the name of the second candle: ");
        String nameTwo = scnr.next();
        System.out.print("Please enter the type of the second candle: ");
        int typeTwo = scnr.nextInt();
        System.out.print("Please enter the price of the second candle: ");
        double priceTwo = scnr.nextDouble();
        System.out.print("Please enter the burn time of the second candle in minutes: ");
        int burnTimeTwo = scnr.nextInt();

        System.out.print("Please enter the name of the third candle: ");
        String nameThree = scnr.next();
        System.out.print("Please enter the type of the third candle: ");
        int typeThree = scnr.nextInt();
        System.out.print("Please enter the price of the third candle: ");
        double priceThree = scnr.nextDouble();
        System.out.print("Please enter the burn time of the third candle in minutes: ");
        int burnTimeThree = scnr.nextInt();

        Candle CandleOne = new Candle(nameOne, typeOne, priceOne, burnTimeOne); {
        }
        Candle CandleTwo = new Candle(nameTwo, typeTwo, priceTwo, burnTimeTwo); {
        }
        Candle CandleThree = new Candle(nameThree, typeThree, priceThree, burnTimeThree); {
        }

        System.out.print("How many type 1 (" + nameOne + ") candles would you like?: ");
        int typeOneQuantity = scnr.nextInt();
        System.out.print("How many type 2 (" + nameTwo + ") candles would you like?: ");
        int typeTwoQuantity = scnr.nextInt();
        System.out.print("How many type 3 (" + nameThree + ") candles would you like?: ");
        int typeThreeQuantity = scnr.nextInt();

        double totalPrice = (CandleOne.getCost() * (double)typeOneQuantity) + (CandleTwo.getCost() * (double)typeTwoQuantity) + (CandleThree.getCost() * (double)typeThreeQuantity);
        if (totalPrice > 20.0 && totalPrice <= 35.0){
            totalPrice = totalPrice * .95;
        }
        else if (totalPrice > 35.0 && totalPrice <= 55.0){
            totalPrice = totalPrice * .93;
        }
        else if (totalPrice > 55.0 && totalPrice <= 100.0){
            totalPrice = totalPrice * .90;
        }
        else if (totalPrice > 100.0){
            totalPrice = totalPrice * .80;
        }
        int totalBurnTime = ((CandleOne.getTime() * typeOneQuantity) + (CandleTwo.getTime() * typeTwoQuantity) + (CandleThree.getTime() * typeThreeQuantity));
        double costPerMinute = totalPrice / (double)totalBurnTime; 
        double totalPriceBeforeDiscount = (CandleOne.getCost() * (double)typeOneQuantity) + (CandleTwo.getCost() * (double)typeTwoQuantity) + (CandleThree.getCost() * (double)typeThreeQuantity);
        int totalQuantity = typeOneQuantity + typeTwoQuantity + typeThreeQuantity;
        int rewardsPoints = 0;
        if (totalQuantity >=5 && totalQuantity < 10){
            rewardsPoints = 1;
        }
        else if (totalQuantity >=10 && totalQuantity < 15){
            rewardsPoints = 2;
        }
        else if (totalQuantity >=15 && totalQuantity < 20){
            rewardsPoints = 3;
        }
        else if (totalQuantity >=20 && totalQuantity < 25){
            rewardsPoints = 4;
        }
        else if (totalQuantity >25){
            rewardsPoints = 5;
        }

        System.out.println(" ");
        System.out.println("****************************   TOTALS   *******************************");
        System.out.println("Thank you for purchasing " + typeOneQuantity + " type " + typeOne + " (" + nameOne + ") candles!");
        System.out.println("Thank you for purchasing " + typeTwoQuantity + " type " + typeTwo + " (" + nameTwo + ") candles!");
        System.out.println("Thank you for purchasing " + typeThreeQuantity + " type " + typeThree + " (" + nameThree + ") candles!");
        System.out.println("The total price is: $" + totalPriceBeforeDiscount + " before the discount is applied");
        System.out.println("The total price is: $" + totalPrice + " after the discount is applied");
        System.out.println("The total burn time is: " + totalBurnTime + " minutes");
        System.out.println("The cost per minute is: $" + costPerMinute); 
        System.out.println("You earned " + rewardsPoints + " rewards point today!");
        System.out.println(" ");

        System.out.println("****************************   HISTOGRAM   *******************************");
        System.out.print(typeOneQuantity + " type " + typeOne + " (" + nameOne + ") candles!: ");
        for (int i = typeOneQuantity;i>0;i--){
            System.out.print("🦍");
        }
        System .out.println(" ");
        System.out.print(typeTwoQuantity + " type " + typeTwo + " (" + nameTwo + ") candles!: ");
        for (int i = typeTwoQuantity;i>0;i--){
            System.out.print("🦧");
        }
        System .out.println(" ");
        System.out.print(typeThreeQuantity + " type " + typeThree + " (" + nameThree + ") candles!: ");
        for (int i = typeThreeQuantity;i>0;i--){
            System.out.print("🐒");
        }
        System.out.println(" ");
        
    }
    
}

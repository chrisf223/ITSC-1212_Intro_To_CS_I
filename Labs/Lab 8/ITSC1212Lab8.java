import java.util.Scanner;
import java.awt.Color;

public class ITSC1212Lab8 {
    
    static int randomX = ((int)(Math.random() * 100)) * 5;
    static int randomY = ((int)(Math.random() * 100)) * 5;
    static World w = new World(500,500);

    public static void main(String[] args) throws InterruptedException {
        Turtle tom = new Turtle(w);
        Scanner scnr = new Scanner(System.in);
        tom.setVisible(false);

        System.out.println(randomX + " " + randomY);

        System.out.println("Would you prefer to play in easy or hard mode?");
        System.out.print("Please enter either '1' for easy mode or '2' for hard mode: ");
        int easyOrHard = scnr.nextInt();

        System.out.print("Enter a guess for the X position of Tom: ");
        int guessX = scnr.nextInt();
        System.out.print("Enter a guess for the Y position of Tom: ");
        int guessY = scnr.nextInt();
        tom.moveTo(randomX,randomY);
        boolean correctX = false;
        boolean correctY = false;

            
            while (!correctX || !correctY)
            {    
                //if (guessX == randomX || (easyOrHard == 1 && (Math.abs(guessX-randomX) <= 20))) {
                    correctX = true;
                    System.out.println("Correct X value!");
                    }   
                if (guessX != randomX){
                    colorGuessX(guessX);
                    guessX = scnr.nextInt();
                    System.out.print("");
                    if (guessX > randomX) {
                        colorGuessX(guessX);
                        System.out.print("Guess a lower X value: ");
                        }
                    if (guessX < randomX) {
                        colorGuessX(guessX);
                        System.out.print("Guess a higher X value: ");
                        }   
                    }  
                // if (guessY > randomY && easyOrHard != 1) {
                //     System.out.print("Guess a lower Y value: ");
                //     colorGuessY(guessY);
                //     }
                // if (guessY < randomY && easyOrHard != 1) {
                //     colorGuessY(guessY);
                //     System.out.print("Guess a higher Y value: ");
                //     }      
                // if (guessY != randomY) {
                //     guessY = scnr.nextInt();
                //     colorGuessY(guessY);
                //     System.out.print("");
                //     } 
                // if (guessY == randomY || (easyOrHard == 1 && (Math.abs(guessY-randomY) <= 20))) {
                //     correctY = true;
                //     System.out.println("Correct Y Value!");
                //     }                     
            }

            System.out.println("You found the turtle!!!");
                tom.setVisible(true);
                scnr.close();
            
        
        
    }

    public static void colorGuessY(int y) throws InterruptedException {
		// Set up a new Turtle to start drawing horizontal lines
		Thread.sleep(10);
		Turtle jen = new Turtle(w);
		jen.setVisible(false);
		jen.setPenColor(Color.black);
		jen.setHeading(90);
		jen.penUp();
		jen.moveTo(0, y);
		jen.penDown();

		// Draw lines to block off areas of the World where the Turtle isn't
		if (y > randomY) {
			for (int i = y;i < 500;i++) {
				jen.moveTo(0, i);
				jen.forward(499);
			}
		} else {
			for (int i = y;i >= 0;i--) {
				jen.moveTo(0, i);
				jen.forward(499);
			}
		}

	}

	public static void colorGuessX(int x) throws InterruptedException {
		// Set up a new Turtle to start drawing vertical lines
		Thread.sleep(10);
		Turtle jen = new Turtle(w);
		jen.setVisible(false);
		jen.setPenColor(Color.black);
		jen.setHeading(180);
		jen.penUp();
		jen.moveTo(x, 0);
		jen.penDown();

		// Draw lines to block off areas of the World where the Turtle isn't
		if (x > randomX) {
			for (int i = x;i < 500;i++) {
				jen.moveTo(i, 0);
				jen.forward(499);
			}
		} else {
			for (int i = x;i >= 0 ;i--) {
				jen.moveTo(i, 0);
				jen.forward(499);
			}
		}

	}
 }


    


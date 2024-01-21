public class TurtleCheckerboard {
    public static void main(String[] args) {
        World w = new World(500,500);
        Turtle tom = new Turtle(w);
        tom.penUp();
        tom.moveTo(50,50);
        tom.setHeading(0);
        tom.penDown();

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++){
                tom.drawSquare();
                tom.penUp();
                tom.turn(90);
                tom.forward(100);
                tom.turn(270);
                tom.penDown();
            }
            int yPosition = tom.getYPos();
            tom.penUp();
            tom.moveTo(50,yPosition+100);
            tom.penDown();
        }
        tom.setVisible(true);

    }
}

public class ITSC1212Lab3 {
    public static void main(String[] args) {
       // Part B
        // World w = new World();
        // Turtle tom = new Turtle(w);

        // tom.forward();
        // tom.turn(270);
        // tom.penUp();
        // tom.forward(50);
        // tom.turn(180);
        // tom.penDown();
        // tom.forward();
        // tom.penUp();
        // tom.forward(20);
        // tom.penDown();
        // tom.turn(90);
        // tom.forward();
        // tom.turn(270);
        // tom.forward(75);
        // tom.turn(270);
        // tom.forward();
        // tom.turn(270);
        // tom.forward(75);
        // tom.turn(180);
        // tom.penUp();
        // tom.forward(125);
        // tom.turn(90);
        // tom.penUp();
        // tom.forward();
        // tom.turn(180);
        // tom.penDown();
        // tom.forward();
        // tom.turn(135);
        // tom.forward(50);
        // tom.turn(270);
        // tom.forward(50);
        // tom.turn(135);
        // tom.forward();

       // Part C
        // World w = new World(500,500);
        // Turtle tom = new Turtle(w);
        // Turtle thom = new Turtle(w);
        // Turtle flom = new Turtle(w);
        // Turtle glong = new Turtle(w);

        // tom.hexagon();
        // thom.turn(90);
        // thom.hexagon();
        // flom.turn(180);
        // flom.hexagon();
        // glong.turn(270);
        // glong.hexagon();
        // tom.setVisible(false);
        // thom.setVisible(false);
        // flom.setVisible(false);
        // glong.setVisible(false);

       // Part D
        World w = new World(500,500);
        Turtle tom = new Turtle(w);
        Turtle thom = new Turtle(w);
        Turtle flom = new Turtle(w);
        Turtle glong = new Turtle(w);

        tom.hexagon(50);
        thom.turn(90);
        thom.hexagon(100);
        flom.turn(180);
        flom.hexagon(75);
        glong.turn(270);
        glong.hexagon(125);
        tom.setVisible(false);
        thom.setVisible(false);
        flom.setVisible(false);
        glong.setVisible(true);

       

          }

    }    

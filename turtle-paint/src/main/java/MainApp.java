import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
//        World world = new World(800, 800);
//        Turtle turtle = new Turtle(world,-100, -100);
//
//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);



        World world = new World(600, 600);
        Turtle turtle = new Turtle(world,0, -300);

       //draw black x & y axis
        turtle.setColor(Color.BLACK);
        turtle.setPenWidth(2);
        turtle.turnRight(90);
        turtle.forward(600);
        turtle.penUp();
        turtle.turnLeft(90);
        turtle.goTo(-300,0);
        turtle.penDown();
        turtle.forward(600);
        turtle.penUp();

        turtle.setColor(Color.red);


       // draw Square
        turtle.goTo(-250,250);
        turtle.penDown();
        turtle.forward(220);
        turtle.turnRight(90);
        turtle.forward(220);
        turtle.turnRight(90);
        turtle.forward(220);
        turtle.turnRight(90);
        turtle.forward(220);

        turtle.setDelay(0);
        turtle.penUp();
        turtle.goTo(150, 250);
        turtle.penDown();
        turtle.turnRight(90);

       //draw  circle loop
        for (int i = 0; i < 360; i++) {
            turtle.forward(2);
            turtle.turnRight(1);
        }

        turtle.penUp();
        turtle.goTo(-150, -20);
        turtle.penDown();

        //draw red circle2 loop
        for (int i = 0; i < 90; i++) {
            turtle.forward(2);
            turtle.turnRight(1);
        }
        turtle.turnRight(90);
        turtle.forward(116);
        turtle.turnLeft(90);
        turtle.forward(116);
        turtle.turnRight(90);

        for (int i = 0; i < 180; i++) {
            turtle.forward(2);
            turtle.turnRight(1);
        }

        turtle.penUp();
        turtle.turnRight(90);
        turtle.setColor(Color.BLUE);

        //Draw blue
        turtle.goTo(-22, -140);
        turtle.penDown();
        for (int i = 0; i < 90; i++) {
            turtle.forward(2);
            turtle.turnRight(1);
        }
        turtle.turnRight(90);
        turtle.forward(110);
        turtle.turnRight(90);
        turtle.forward(110);
    }

}

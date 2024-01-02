package models;

import java.awt.*;
import java.util.Random;

/* Name: 14
 Ly Hoang Vu-ITITIU18260, Bui Trung Kien-ITITIU18201
 Purpose: Pong game - Algorithm and data structures course
*/

public class Ball extends Rectangle {

    Random random;
    public int xVelocity;
    public int yVelocity;
    int initialSpeed = 3;

    public Ball(int x, int y, int BALL_WIDTH, int BALL_HEIGHT) {
        super(x, y, BALL_WIDTH, BALL_HEIGHT);
        random = new Random();
        int xRandomDirection = random.nextInt(2);
        if (xRandomDirection == 0) xRandomDirection--;
        setXDirection(xRandomDirection * initialSpeed);

        int yRandomDirection = random.nextInt(2);
        if (yRandomDirection == 0) yRandomDirection--;
        setYDirection(yRandomDirection * initialSpeed);
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.fillOval(x,y, height, width);
    }
}

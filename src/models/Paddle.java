package models;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle{

    int id;
    int yVelocity;

    public Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void pressKey(KeyEvent keyEvent) {
    }

    public void releaseKey(KeyEvent keyEvent) {
    }

    public void setYDirection(int yDirection) {
    }

    public void move() {
    }

    public void draw(Graphics graphics) {
        if (id == 1) graphics.setColor(Color.BLACK);
        else graphics.setColor(Color.RED);
        graphics.fillRect(x, y, width, height);
    }
}

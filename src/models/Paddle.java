package models;

import java.awt.*;
import java.awt.event.KeyEvent;

/* Name: 14
 Ly Hoang Vu-ITITIU18260, Bui Trung Kien-ITITIU18201
 Purpose: Pong game - Algorithm and data structures course
*/

public class Paddle extends Rectangle{

    int id;
    int yVelocity;
    int speed = 10;

    public Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void pressKey(KeyEvent keyEvent) {
        switch (id) {
            case 1:
                if (keyEvent.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                }

                if (keyEvent.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                    move();
                }

                if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                    move();
                }
                break;
        }
    }

    public void releaseKey(KeyEvent keyEvent) {
        switch (id) {
            case 1:
                if (keyEvent.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(0);
                    move();
                }

                if (keyEvent.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }

            case 2:
                if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(0);
                    move();
                }

                if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0);
                    move();
                }
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void move() {
        y = y + yVelocity;
    }

    public void draw(Graphics graphics) {
        if (id == 1) graphics.setColor(Color.BLACK);
        else graphics.setColor(Color.RED);
        graphics.fillRect(x, y, width, height);
    }
}

package gui;

import models.Ball;
import models.Paddle;
import models.Score;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements Runnable {

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.55555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;

    GamePanel() {

    }

    public void createNewBall() {
    }

    public void createNewPaddle() {

    }

    public void paint(Graphics g) {

    }

    public void draw(Graphics graphics) {

    }

    public void move() {
    }

    public void run() {

    }

    public void checkCollision() {
    }

    public class AL extends KeyAdapter {
        public void pressKey(KeyEvent keyEvent) {}
        public void releaseKey(KeyEvent keyEvent) {}
    }
}

package models;

import java.awt.*;

/* Name: 14
 Ly Hoang Vu-ITITIU18260, Bui Trung Kien-ITITIU18201
 Purpose: Pong game - Algorithm and data structures course
*/

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    public int player1;
    public int player2;

    public Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.setFont(new Font("Consolas", Font.PLAIN, 60));
        graphics.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        graphics.drawString(String.valueOf(player1/10) + String.valueOf(player1 % 10) , (GAME_WIDTH/2) - 85, 50);
        graphics.drawString(String.valueOf(player2/10) + String.valueOf(player2 % 10), (GAME_WIDTH/2) + 20, 50);
    }
}

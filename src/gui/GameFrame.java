package gui;

import javax.swing.*;
import java.awt.*;

/* Name: 14
 Ly Hoang Vu-ITITIU18260, Bui Trung Kien-ITITIU18201
 Purpose: Pong game - Algorithm and data structures course
*/

public class GameFrame extends JFrame {

    GamePanel panel;

    public GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong game");
        this.setResizable(false);
        this.setBackground(Color.LIGHT_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}

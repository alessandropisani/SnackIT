package gui;

import javax.swing.*;

public class PopUp {

    static JFrame jf1;

    public static void fenster() {
        jf1 = new JFrame("Game Over");
        jf1.setSize(300,200);
        jf1.setResizable(false);
        jf1.setVisible(true);

    }
}



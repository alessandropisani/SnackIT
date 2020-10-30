package gui;

import actions.KeyHandler;
import gui.Gui;
import clocks.GameClock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static JFrame men;
    static JButton but;

    public void menue(){
        men = new JFrame("Menu");
        men.setSize(200 ,200);
        men.setLocationRelativeTo(null);
        men.setLayout(null);
        men.setResizable(false);
        men.addKeyListener(new KeyHandler());


        men.requestFocus();
        men.setVisible(true);


        but = new JButton("Start");
        but.setSize(100 , 100);
        but.setVisible(true);
        men.add(but);
        but.addActionListener(new start());
    }
    static class start implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Gui g = new Gui();
            GameClock gc = new GameClock();

            g.create();
            gc.start();
            men.setVisible(false);
        }
    }
}

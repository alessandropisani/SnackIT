package clocks;

import actions.Collision;
import actions.KeyHandler;
import game.Snake;
import gui.Gui;
//import gui.PopUp;

import javax.swing.*;
import java.awt.*;

public class GameClock extends Thread{
    public static boolean running = true;



    public void run(){
        while(running){
            try {
                sleep(150);
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUp();
                if (Collision.collideSelf()){
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;
                    sleep(1000);

                }
                if (Collision.collideWall()){
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;
                    sleep(1000);

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

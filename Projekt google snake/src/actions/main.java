package actions;

import clocks.GameClock;
import gui.Gui;
//import gui.Menu;

public class main {
    public static void main(String[] args) {
        Gui g = new Gui();
        GameClock gc = new GameClock();
        //Menu m = new Menu();



        //m.menue();
        g.create();
         gc.start();
    }
}

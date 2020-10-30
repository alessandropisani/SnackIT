package gui;

import actions.KeyHandler;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gui {
    public static JFrame jf;
    ImageIcon icon;
    static Draw d;
    static BufferedImage ins;
    static BufferedImage emi;
    static BufferedImage apf;
    static BufferedImage bck;
    static BufferedImage tro;
    static BufferedImage fel;
    static BufferedImage shR;

    public static JButton einstellungen;


    public static int width = 800, height = 600;
    public static int xoff = 127, yoff = 20;

    public void create() {
        icon = new ImageIcon("rsc/snake bilder/apfellll.png");
        jf = new JFrame("SnackIT");
        jf.setSize(width, height);
        jf.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.addKeyListener(new KeyHandler());




        d = new Draw();
        d.setBounds(0, 0, width, height);
        d.setVisible(true);
        jf.add(d);


        try{
            //Intsa
            //ins = ImageIO.read(new File("rsc/Instagram_AppIcon_Aug2017.png"));
            //Email
            //emi = ImageIO.read(new File("rsc/gmail.png"));

            //APFELL
            apf = ImageIO.read(new File("rsc/food.png"));

            //background
            bck = ImageIO.read(new File("rsc/background.png"));

            //trofäheee
            tro = ImageIO.read(new File("rsc/trophyyyyyy.png"));

            //feld
            fel = ImageIO.read(new File("rsc/felddd.png"));

            //snake head
            shR= ImageIO.read(new File("rsc\\snake bilder\\righthead.png"));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Bild Konne nicht geladen werden!");
        }

        jf.requestFocus();
        jf.setVisible(true);

        //knöpfe
        einstellungen = new JButton("Einstellunen");
        einstellungen.setBounds(120,40,160,40);
        einstellungen.setVisible(true);
        jf.add(einstellungen);

    }
}

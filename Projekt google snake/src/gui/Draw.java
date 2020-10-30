package gui;

import game.Dir;
import game.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import static game.Dir.*;
import static game.Dir.RIGHT;
import static java.awt.event.KeyEvent.VK_D;

public class Draw extends JLabel {

    Point p;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);

        // Draw Background
        g.setColor(new Color(4,4,4));
        g.fillRect(0,0,800,600);

        //draw field
        g.drawImage(Gui.fel,127,20,512,512,null);


        // draw snake tail
        g.setColor(new Color(186, 186, 186));
        for(int i = 0; i< Snake.tails.size(); i++){
            p = Snake.ptc(Snake.tails.get(i).getX(),Snake.tails.get(i).getY());
            g.fillRect(p.x,p.y, 32,32);
        }

        //draw Snake Head
            g.setColor(new Color(255, 255, 255, 255));
            p = Snake.ptc(Snake.head.getX(), Snake.head.getY());
            g.fillRect(p.x, p.y, 32, 32);


        //draw pick up
        p = Snake.ptc(Snake.pickup.getX(), Snake.pickup.getY());
        g.drawImage(Gui.apf,p.x,p.y,null);

        //aw grid
     //g.setColor(new Color(57, 155, 40));
    //for(int i = 0; i<16; i++){
     //     for(int j = 0; j<16; j++){
     //        g.drawRect(i * 32 + Gui.xoff,j * 32 + Gui.yoff , 32, 32);
       //   }
      //}


        // draw Border
        g.setColor(new Color(4, 4, 4));
        g.drawRect(Gui.xoff, Gui.yoff, 512,512);

        //draw trophy
        g.drawImage(Gui.tro,645,20,32,32,null);

        //draww aplle
        g.drawImage(Gui.apf,10,20,32,32,null);


        //draw score
        g.setColor(new Color(255, 255, 255));
        g.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
        g.drawString(" " +Snake.score, 42,45);
        g.drawString(" " +Snake.bestscore, 680,40);

        g.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN,15));
        g.drawString("MADE BY",29,510 );
        g.drawString("Alessandro",20,530 );

        g.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN,14));
        //g.drawString("alee__.03",680,510);
        //g.drawString("Michiiiii",680,530);

        g.setFont(new Font("Franklin Gothic Heavy",Font.PLAIN,12));
        g.drawString("ales.pisa@gmail.com",650,500);
        //g.drawString("michi.DS@gmail.com",680,487);

        repaint();

        //instagramm foto
        //g.drawImage(Gui.ins,645,500,32,32,null);

        //email Foto
        //g.drawImage(Gui.emi,645,460,32,32,null);
    }


}

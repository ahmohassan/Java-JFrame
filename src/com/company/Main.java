package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends Canvas  {
//    Main(){
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(600,600);
//        this.setLocationRelativeTo(null);
//        this.setVisible(true);
//    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(10, 600,740, 80);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(120, 200,600, 440);

        g.setColor(Color.red); // roof color
        g.fillRect(100, 200,639, 70);


        g.setColor(Color.red); //Door color
        g.fillRect(350, 480,120, 190);

        g.setColor(Color.gray); //shsous color
        g.fillRect(350, 630,120, 50);

        g.setColor(Color.black); //steps color
        g.fillRect(350, 670,120, 10);
        g.fillRect(350, 650,120, 10);
        g.fillRect(350, 630,120, 10);


        g.setColor(Color.darkGray); //window border color 1
        g.fillRect(150, 350,130, 110);

        g.setColor(Color.red); //window color 1
        g.fillRect(155, 355,120, 100);


        g.setColor(Color.darkGray); //window border color 2
        g.fillRect(530, 350,130, 110);

        g.setColor(Color.red); //window  color 2
        g.fillRect(535, 355,120, 100);

        g.setColor(Color.black);
        g.fillRect(120, 160,50, 60);



//        setForeground(Color.black);
    }
    public static void main(String[] args) {
        Main m=new Main();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(1020,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }

}


package gui;

import actions.KeyHandler;

import javax.swing.*;

public class Gui {
    JFrame jf;
    Draw d;

    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;

    public void create() {
        jf = new JFrame(); // Neues Objekt aus JFrame
        jf.setTitle("Snake"); // Title des Spiels bzw. des Gui´s
        jf.setSize(width,height); // Dimensionen werden aus Variablen gebildet
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Schließen des Programms
        //jf.setLocation(null); // Fenster erscheint in der Mitte
        jf.setLayout(null); // damit Buttons frei gesetzt werden können
        jf.setResizable(false);
        jf.addKeyListener(new KeyHandler());

        d = new Draw();
        d.setBounds(0,0,width, height);
        d.setVisible(true);
        jf.add(d); // Objekt Draw wird dem jf hinzugefügt

        jf.requestFocus(); // für Tastatureingabe
        jf.setVisible(true);

    }
}

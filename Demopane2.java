/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

/**
 * Michael Jonathan Setiawan
 * 58170468
 */

import javax.swing.*;
import java.awt.*;
public class Demopane2 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("jscrollpane");
        JTextArea text = new JTextArea();
        JScrollPane scrollpane = new JScrollPane();
        scrollpane.getViewport().add(text);
        scrollpane.setPreferredSize(new Dimension(200, 100));

        frame.getContentPane().add(scrollpane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}

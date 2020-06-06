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
public class Demopane {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("JPanel");
        JPanel pane1 = new JPanel (new GridLayout(2, 3));
        JPanel pane2 = new JPanel();
        JPanel pane3 = new JPanel (new BorderLayout(2, 3));
        
        pane1.add(new JButton("Button 1"));
        pane1.add(new JButton("Button 2"));
        pane1.add(new JTextArea("Text 1"));
        
        pane3.add(new JButton("1"));
        pane3.add(new JButton("Button 1"));
        
        pane2.add(new JTextArea("Text 1"));
        pane2.add(pane3);
        
        frame.getContentPane().add(pane1, BorderLayout.NORTH);
        frame.getContentPane().add(pane2, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}

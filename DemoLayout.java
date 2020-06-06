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
public class DemoLayout {
    public static void main (String[] args) {
        JFrame frame = new JFrame("BoxLayout");
        
        Box comp = new Box(BoxLayout.X_AXIS);
        
        JButton btn1 = new JButton("Posisi 1");
        JButton btn2 = new JButton("Posisi 2");
        JButton btn3 = new JButton("Posisi 3");
        JButton btn4 = new JButton("Posisi 4");
        JButton btn5 = new JButton("Posisi 5");
        
        comp.add(btn1);
        comp.add(btn2);
        comp.add(btn3);
        comp.add(btn4);
        comp.add(btn5);
        frame.getContentPane().add(comp);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}

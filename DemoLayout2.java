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
public class DemoLayout2 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("FlowLayout");
        
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        layout.setVgap(10);
        layout.setHgap(10);
        
        frame.getContentPane().setLayout(layout);
        JButton btn1 = new JButton("Posisi 1");
        JButton btn2 = new JButton("Posisi 2");
        JButton btn3 = new JButton("Posisi 3");
        JButton btn4 = new JButton("Posisi 4");
        JButton btn5 = new JButton("Posisi 5");
        
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(btn2);
        frame.getContentPane().add(btn3);
        frame.getContentPane().add(btn4);
        frame.getContentPane().add(btn5);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}

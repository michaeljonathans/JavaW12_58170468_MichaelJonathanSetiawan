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
public class DemoLayout3 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("GridLayout");

        JTextArea text1 = new JTextArea("Text 1");
        JTextArea text2 = new JTextArea("Text 2");
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");

        GridLayout layout = new GridLayout(3, 2);
        layout.setHgap(5);
        layout.setVgap(10);

        frame.getContentPane().setLayout(layout);
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(btn2);
        frame.getContentPane().add(btn3);
        frame.getContentPane().add(text1);
        frame.getContentPane().add(text2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}

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
public class DemoTextField {
    public static void main (String[] args) {
        JFrame frame = new JFrame("TextField");
        JTextField text1, text2, text3, text4;
        text1 = new JTextField("Text 1");
        text2 = new JTextField("Text 2");
        text3 = new JTextField("Text 3");
        text4 = new JTextField("Text 4");

        Box panel = new Box(BoxLayout.Y_AXIS);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(text4);

        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}

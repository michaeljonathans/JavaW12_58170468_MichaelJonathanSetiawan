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
public class FormSederhana2 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("GUI Swing 2");
        JPanel pane1 = new JPanel(new GridLayout(1, 3));
        JPanel pane2 = new JPanel(new GridLayout(1, 3));
        JPanel pane3 = new JPanel(new GridLayout(1, 4));
        JTextArea text = new JTextArea();
        String str = "aku\n"
                + "sedang\n"
                + "belajar\n"
                + "java proramming\n"
                + "bersama\n"
                + "teman-teman\n";

        pane1.add(new JLabel(""));
        pane1.add(new JTextArea(str));
        pane1.add(new JLabel(""));

        pane2.add(new JLabel(""));
        pane2.add(new JTextField(""));
        pane2.add(new JLabel(""));

        pane3.add(new JLabel(""));
        pane3.add(new JButton("ADD"));
        pane3.add(new JButton("CLEAR"));
        pane3.add(new JLabel(""));

        frame.getContentPane().add(pane1, BorderLayout.NORTH);
        frame.getContentPane().add(pane2, BorderLayout.CENTER);
        frame.getContentPane().add(pane3, BorderLayout.AFTER_LAST_LINE);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text.setSize(150, 75);
        frame.setSize(380, 220);
        frame.setVisible(true);
    }
}

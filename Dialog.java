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
public class Dialog {
    public static void main (String[] args) {
        JFrame f2;
        f2 = new JFrame("Ini sebuah frame lho...");
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);
        JOptionPane.showConfirmDialog(f2, "ini adalah sebuah contoh dialog ...",
                "ini judul dialognya ...!",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}

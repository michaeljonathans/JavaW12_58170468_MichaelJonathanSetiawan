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
public class DemoLabel {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Demo HTML");

        String html = "<html>\n"
                + "Contoh penggunaan HTML dan label: \n"
                + "<ul>\n"
                + "<li><font color = red>merah</font>\n"
                + "<li><font color = green>hijau</font>\n"
                + "<li><font color = yellow>kuning</font>\n"
                + "<li><font size = -2>di langit yang</font>\n"
                + "<li><font color = blue>biru</font>\n"
                + "<li><font size = -2>bintang kecil?</font>\n"
                + "<li><font size = +2>besar?</font>\n"
                + "<li><i>italic</i>\n"
                + "<li><b>bold</b>\n"
                + "</ul>\n";

        JLabel label = new JLabel(html);
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}

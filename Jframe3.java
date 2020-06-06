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
public class Jframe3 extends JFrame {
    JPanel jp = new JPanel();
    JTextField jt = new JTextField();
    JLabel jl = new JLabel("Contoh label");

    public Jframe3() {
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(15, 20, 80, 25);
        jt.setBounds(120, 20, 80, 25);
    }

    public static void main (String[] args) {
        Jframe3 demo2 = new Jframe3();
        demo2.setTitle("Form dengan Label dan Textfield");
        demo2.setSize(300, 300);
        demo2.setVisible(true);
    }
}

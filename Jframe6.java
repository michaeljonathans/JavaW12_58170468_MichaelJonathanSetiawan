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
public class Jframe6 {
    public static void main (String[] args) { //agar dapat di-run sebagai class utama
        JFrame frame = new JFrame("Contoh tampilan fram dalam java."); //membuat objek
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //aktivitas jika form ditutup
        frame.setSize(400, 150); //setting ukuran form
        frame.show();
    }
}

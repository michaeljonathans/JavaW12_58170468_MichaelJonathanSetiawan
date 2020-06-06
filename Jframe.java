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
public class Jframe {
    public static void main (String[] args) { //agar dapat di-run sebagai class utama
        JFrame myWindow;
        myWindow = new JFrame(); //membuat objek
        myWindow.setSize(300, 200); //setting ukuran form
        myWindow.setTitle("Program GUI Pertama"); //judul untuk form
        myWindow.setVisible(true); //menampilkan form
    }
}

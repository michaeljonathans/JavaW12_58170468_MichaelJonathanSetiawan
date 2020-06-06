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
public class Dialog2 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Contoh tamplilan frame di Java.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
        JOptionPane.showConfirmDialog(frame,
                "Contoh dialog konfirmasi ...",
                "Title Konfirmasi",
                JOptionPane.OK_CANCEL_OPTION, //salah satu jenis tombol yang digunakan
                JOptionPane.QUESTION_MESSAGE); //icon yang dipanggil
    }
}

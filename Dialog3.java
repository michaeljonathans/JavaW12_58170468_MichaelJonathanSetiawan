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
public class Dialog3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh frame.");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();

        int result = JOptionPane.showConfirmDialog(frame, "Pilih ok atau cancel?", "Title konfirmasi",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        String message;

        if (result == JOptionPane.OK_OPTION) {
            message = "Tombol OK diklik";
        } else if (result == JOptionPane.CANCEL_OPTION) {
            message = "Tombol cancel diklik";
        } else {
            message = "Tidak ada tombol yang diklik";
        }

        JOptionPane.showMessageDialog(frame,
                message, "Pilihan anda", JOptionPane.INFORMATION_MESSAGE);
    }
}

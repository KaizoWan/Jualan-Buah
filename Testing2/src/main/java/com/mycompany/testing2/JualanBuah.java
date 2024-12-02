/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testing2;

import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author ridwan
 */
public class JualanBuah {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Background Warna Kustom");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Warna kustom RGB
        frame.getContentPane().setBackground(new Color(128, 128, 255));

        frame.setVisible(true);
    }
}
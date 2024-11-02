/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thrs.notacion;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author peter
 */
public class Principal {

    public static void main(String[] args) {

        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatIntelliJLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.out.println("LookAndFeel no soportado: " + ex);
                }
                new VistaNotacion().setVisible(true);
            }
        };
        SwingUtilities.invokeLater(runApplication);

    }

}

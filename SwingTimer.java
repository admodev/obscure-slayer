package com.swingtimer;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SwingTimer extends JFrame {
    public SwingTimer() {
        initUI();
    }

    private void initUI() {
        add (new Board());
        setResizable(false);
        pack();

        setTitle("Sword");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SwingTimer = new SwingTimer();
            ex.setVisible(true);
        });
    }
}

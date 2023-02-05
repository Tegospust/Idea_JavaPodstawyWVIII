
package com.ounis.buttonpanel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonPanel extends JFrame{

    private class ColorAction implements ActionListener {

        private Color backgroundColor;
        private JPanel panel;
        public ColorAction(Color c, JPanel p) {
            backgroundColor = c;
            panel = p;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(backgroundColor);
        }
    }

    public void makeButton(JPanel bp,String name,Color c) {
        JButton btn = new JButton(name);
        bp.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bp.setBackground(c);
            }
        });
    }

    public ButtonPanel() {
        setTitle("ButtonPanel");
        setSize(320,200);

//        JButton yellowButton    =   new JButton("yellow");
//        JButton blueButton      =   new JButton("blue");
//        JButton redButton       =   new JButton("red");

        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(redButton);
//        buttonPanel.add(blueButton);
//        buttonPanel.add(yellowButton);
        makeButton(buttonPanel, "red", Color.RED);
        makeButton(buttonPanel,"blue",Color.BLUE);
        makeButton(buttonPanel,"yellow",Color.YELLOW);

        add(buttonPanel);

//        redButton.addActionListener(new ColorAction(Color.RED,buttonPanel));
//        yellowButton.addActionListener(new ColorAction(Color.YELLOW,buttonPanel));
//        blueButton.addActionListener(new ColorAction(Color.BLUE,buttonPanel));

    }

    public static void main(String... args) {
//        JOptionPane.showMessageDialog(null, "SURFACE!!!");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ButtonPanel frame = new ButtonPanel();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

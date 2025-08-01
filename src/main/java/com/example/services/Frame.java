package com.example.services;

import com.example.enums.Board;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Frame extends JFrame {

  Frame() {
    setSize(Board.WIDTH.getSize(), Board.HIGHT.getSize());
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    add(new DisplayPanel(), BorderLayout.NORTH);

    add(new ButtonsPanel());

    setVisible(true);
  }
}

package com.example.services;

import com.example.enums.Colors;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Label extends JLabel {

  private final Font FONT = new Font("Arial", Font.PLAIN, 80);

  Label() {
    setBackground(Colors.BLACK.getColor());
    setForeground(Color.WHITE);
    setFont(FONT);
    setHorizontalAlignment(RIGHT);
    setText("0");
    setOpaque(true);
  }
}

package com.example.services;

import com.example.enums.Colors;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {

  private final GridLayout grid = new GridLayout(5, 4);

  ButtonsPanel() {
    setLayout(grid);
    setBackground(Colors.BLACK.getColor());
  }
}

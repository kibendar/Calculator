package com.example.services;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class DisplayPanel extends JPanel {

  DisplayPanel() {
    setLayout(new BorderLayout());
    add(new Label());
  }
}

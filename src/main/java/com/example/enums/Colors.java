package com.example.enums;

import java.awt.Color;

public enum Colors {
  LIGHT_GRAY(new Color(212, 212, 210)),
  DARK_GRAY(new Color(80, 80, 80)),
  BLACK(new Color(28, 28, 28)),
  ORANGE(new Color(255, 149, 0));

  private final Color color;

  private Colors(Color color) { this.color = color; }

  public Color getColor() { return color; }
}

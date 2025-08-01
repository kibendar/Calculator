package com.example.services;

public class CalcService {

  private final Frame frame;

  private final DisplayPanel panel;

  private final Label label;

  CalcService(Frame frame, DisplayPanel panel, Label label) {
    this.frame = frame;
    this.panel = panel;
    this.label = label;
  }

  public void runService() {}
}

package com.example.enums;

public enum Board {

  HIGHT(360),
  WIDTH(540);

  private final int size;

  private Board(int size) { this.size = size; }

  public int getSize() { return size; }
}

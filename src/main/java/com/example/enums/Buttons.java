package com.example.enums;

public enum Buttons {

  ONE("1"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  ZERO("0"),
  PLUS("+"),
  MINUS("-"),
  MULTIPLY("×"),
  DIVIDE("÷"),
  EQUAL("="),
  ALL_CLEAR("AC"),
  DOT("."),
  POS_NEG("+/-"),
  SQRT("√"),
  MOD("%");

  private final String button;

  private Buttons(String button) { this.button = button; }

  public String getButton() { return button; }
}

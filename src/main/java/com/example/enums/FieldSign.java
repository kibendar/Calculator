package com.example.enums;

public enum FieldSign {

  FIRST_NUM("0"),
  SECOND_NUM(null),
  OPERATOR(null);

  private String sign;

  FieldSign(String sign) { this.sign = sign; }

  public String getSign() { return sign; }

  public void setSign(String sign) { this.sign = sign; }
}

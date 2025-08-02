package com.example.services;

import com.example.enums.Buttons;

public class CalcOperations {

  private String first_num = "0";
  private String second_num = null;
  private String operator = null;

  public String getFirst_num() { return first_num; }
  public void setFirst_num(String first_num) { this.first_num = first_num; }
  public String getSecond_num() { return second_num; }
  public void setSecond_num(String second_num) { this.second_num = second_num; }
  public String getOperator() { return operator; }
  public void setOperator(String operator) { this.operator = operator; }
}

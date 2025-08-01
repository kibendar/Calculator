package com.example.utils;

import com.example.services.CalcOperations;
import javax.swing.JLabel;

public class UtilsMethods extends JLabel {

  private final CalcOperations calcOps;

  UtilsMethods(CalcOperations calcOps) { this.calcOps = calcOps; }

  public void clearAll() {
    calcOps.setFirst_num("0");
    calcOps.setSecond_num(null);
    calcOps.setOperator(null);
    setText("0");
  }

  public String removeZeroDec(double numDisplay) {
    return numDisplay % 1 == 0 ? Integer.toString((int)numDisplay)
                               : Double.toString(numDisplay);
  }
}

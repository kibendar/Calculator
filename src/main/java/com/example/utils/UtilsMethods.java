package com.example.utils;

import com.example.enums.FieldSign;
import javax.swing.JLabel;

public class UtilsMethods {

  private final JLabel label;

  public UtilsMethods(JLabel label) { this.label = label; }

  public void clearAll() {
    FieldSign.FIRST_NUM.setSign("0");
    FieldSign.SECOND_NUM.setSign(null);
    FieldSign.OPERATOR.setSign(null);
    label.setText("0");
  }

  public String removeZeroDec(double numDisplay) {
    return numDisplay % 1 == 0 ? Integer.toString((int)numDisplay)
                               : Double.toString(numDisplay);
  }

  public void signEqualNull() {

    FieldSign.FIRST_NUM.setSign(label.getText());

    label.setText("0");

    FieldSign.SECOND_NUM.setSign("0");
  }

  public void numDisplay(int num) {

    double numDisplay = Double.parseDouble(label.getText());

    switch (num) {
    case -1 -> numDisplay *= num;
    case 100 -> numDisplay /= num;
    }

    label.setText(removeZeroDec(numDisplay));
  }

  public void signEqualEqual() {

    if (!FieldSign.FIRST_NUM.getSign().equals(null)) {

      FieldSign.SECOND_NUM.setSign(label.getText());

      double firstNum = Double.parseDouble(FieldSign.FIRST_NUM.getSign());
      double secondNum = Double.parseDouble(FieldSign.SECOND_NUM.getSign());

      rightButtonsOperations(firstNum, secondNum);
    }
  }
  public void rightButtonsOperations(double firstNum, double secondNum) {

    switch (FieldSign.OPERATOR.getSign()) {
    case "+":
      label.setText(String.valueOf(firstNum + secondNum));
      break;
    case "-":
      label.setText(String.valueOf(firstNum - secondNum));
      break;
    case "*":
      label.setText(String.valueOf(firstNum * secondNum));
      break;
    case "/":
      label.setText(String.valueOf(firstNum / secondNum));
      break;
    }
  }
}

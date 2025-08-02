package com.example.services;

import com.example.enums.Buttons;
import com.example.enums.Colors;
import com.example.enums.FieldSign;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class ButtonOperations {

  private final ButtonsPanel buttonsPanel;

  private final Label label;

  private final Font FONT = new Font("Arial", Font.PLAIN, 30);

  private int buttonArrLength = Buttons.values().length;

  private String[] rightButtons = {
      Buttons.DIVIDE.getButton(), Buttons.MULTIPLY.getButton(),
      Buttons.MINUS.getButton(), Buttons.PLUS.getButton(),
      Buttons.EQUAL.getButton()};

  private String[] topButtons = {Buttons.ALL_CLEAR.getButton(),
                                 Buttons.POS_NEG.getButton(),
                                 Buttons.MOD.getButton()};

  private final JButton button;

  ButtonOperations(JButton button, ButtonsPanel buttonsPanel, Label label) {
    this.button = button;
    this.buttonsPanel = buttonsPanel;
    this.label = label;
  }

  private void setColorButtons(String buttonValue) {

    if (Arrays.asList(topButtons).contains(buttonValue)) {
      button.setBackground(Colors.LIGHT_GRAY.getColor());
      button.setForeground(Colors.BLACK.getColor());
    } else if (Arrays.asList(rightButtons).contains(buttonValue)) {
      button.setBackground(Colors.ORANGE.getColor());
      button.setForeground(Color.WHITE);
    } else {
      button.setBackground(Colors.DARK_GRAY.getColor());
      button.setForeground(Color.WHITE);
    }
  }

  private ActionListener actionListener() {

    return new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();

        String buttonValue = button.getText();

        if (buttonValue.equals("=")) {
          equalSignEqual();
        }
      }

      private void equalSignEqual() {

        if (!FieldSign.FIRST_NUM.getSign().equals(null)) {

          FieldSign.SECOND_NUM.setSign(label.getText());

          double firstNum = Double.parseDouble(FieldSign.FIRST_NUM.getSign());
          double secondNum = Double.parseDouble(FieldSign.SECOND_NUM.getSign());

          rightButtonsOperations(firstNum, secondNum);
        }
      }
    };
  }

  protected void rightButtonsOperations(double firstNum, double secondNum) {

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

  public void buttonActions() {

    for (int i = 0; i < buttonArrLength; i++) {

      String buttonValue = Buttons.values()[i].getButton();

      button.setFont(FONT);
      button.setText(buttonValue);
      button.setFocusable(false);
      button.setBorder(new LineBorder(Colors.BLACK.getColor()));

      setColorButtons(buttonValue);

      buttonsPanel.add(button);
    }
  }
}

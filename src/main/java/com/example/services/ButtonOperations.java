package com.example.services;

import com.example.enums.Buttons;
import com.example.enums.Colors;
import com.example.enums.FieldSign;
import com.example.utils.UtilsMethods;
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

  private final UtilsMethods utilsMethods;

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

  ButtonOperations(JButton button, ButtonsPanel buttonsPanel, Label label,
                   UtilsMethods utilsMethods) {
    this.button = button;
    this.buttonsPanel = buttonsPanel;
    this.label = label;
    this.utilsMethods = utilsMethods;
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

        if (Arrays.asList(rightButtons).contains(buttonValue)) {

          if (buttonValue.equals("=")) {

            utilsMethods.signEqualEqual();
          } else if ("+-÷×".contains(buttonValue)) {

            if (FieldSign.OPERATOR.getSign() == null) {

              utilsMethods.signEqualNull();
            }
          }

          FieldSign.OPERATOR.setSign(buttonValue);

        } else if (Arrays.asList(topButtons).contains(buttonValue)) {

          if (buttonValue.equals("AC")) {

            utilsMethods.clearAll();
          } else if (buttonValue.equals("+/-")) {

            utilsMethods.numDisplay(-1);
          } else {

            utilsMethods.numDisplay(100);
          }
        } else {

          if (buttonValue.equals(".")) {
            if (!label.getText().contains(buttonValue)) {

              label.setText(label.getText() + buttonValue);
            }
          } else if ("0123456789".contains(buttonValue)) {

            if (label.getText().equals("0")) {

              label.setText(buttonValue);
            } else {

              label.setText(label.getText() + buttonValue);
            }
          }
        }
      }
    };
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

      button.addActionListener(actionListener());
    }
  }
}

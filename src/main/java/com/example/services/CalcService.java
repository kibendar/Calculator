package com.example.services;

public class CalcService {
  private final ButtonOperations operations;

  public CalcService(ButtonOperations operations) {
    this.operations = operations;
  }

  public void runService() {
    operations.buttonActions();
  }
}

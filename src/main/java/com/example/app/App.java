package com.example.app;

public class App {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    int sum = calc.add(2, 3);
    System.out.println("Hello, Sonar! Sum=" + sum);
  }
}
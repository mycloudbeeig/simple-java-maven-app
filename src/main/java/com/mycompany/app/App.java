package com.mycompany.app;

/**
 * Hello world app.
 */
public class App {

  private final String message = "Hello World!";

  public App() {}

  public static void main(String[] args) {
    System.out.println(new App().getMessage());
  }
///hjhgjy7uty
  private final String getMessage() {
    return message;
  }
}

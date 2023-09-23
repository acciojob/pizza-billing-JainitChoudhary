package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println("Deluxe Pizza Bill:");
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();

    System.out.println("\nRegular Pizza Bill:");
    System.out.println(p.getBill());
  }
}

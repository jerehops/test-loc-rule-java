package com.example.app;

import java.time.Instant;
import java.util.UUID;

public class OrderService {
  public String placeOrder(Customer customer, int quantity) {
    if (quantity <= 0) {
      throw new IllegalArgumentException("quantity must be > 0");
    }
    String orderId = UUID.randomUUID().toString();
    String msg = "Order " + orderId + " placed for " + customer.name() + " at " + Instant.now();
    Util.log(msg);
    return orderId;
  }
}
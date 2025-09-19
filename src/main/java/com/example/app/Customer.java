package com.example.app;

import java.util.Objects;

public class Customer {
  private final String id;
  private final String name;
  private final String email;

  public Customer(String id, String name, String email) {
    this.id = Objects.requireNonNull(id);
    this.name = Objects.requireNonNull(name);
    this.email = Objects.requireNonNull(email);
  }

  public String id() {
    return id;
  }

  public String name() {
    return name;
  }

  public String email() {
    return email;
  }

  @Override
  public String toString() {
    return "Customer{id='" + id + "', name='" + name + "', email='" + email + "'}";
  }
}
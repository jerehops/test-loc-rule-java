package com.example.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void add_works() {
    Calculator c = new Calculator();
    assertEquals(5, c.add(2, 3));
  }

  @Test
  void div_by_zero_throws() {
    Calculator c = new Calculator();
    assertThrows(IllegalArgumentException.class, () -> c.div(1, 0));
  }
}
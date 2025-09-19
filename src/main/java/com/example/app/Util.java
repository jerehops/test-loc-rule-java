package com.example.app;

import java.time.Instant;

public final class Util {
  private Util() {
  }

  public static void log(String msg) {
    System.out.println(Instant.now() + " - " + msg);
  }
}
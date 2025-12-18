package com.example.annotations.loggable;

public class LoggableClass {
    @Loggable
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

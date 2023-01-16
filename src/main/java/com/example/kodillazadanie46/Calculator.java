package com.example.kodillazadanie46;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {
    public static void main(String[] args) {
        Calculator operation = new Calculator();
        operation.addition(2,3);
        operation.subtraction(5,4);
    }
    public void addition(int x, int y) {
        System.out.println("Wynik dodawania to : " + (x+y));
    }
    public void subtraction(int x, int y) {
        System.out.println("Wynik odejmoawnia to : " + (x-y));
    }
}
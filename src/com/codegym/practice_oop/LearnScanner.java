package com.codegym.practice_oop;

import java.util.Scanner;

public class LearnScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name entered is: " + name);
    }
}

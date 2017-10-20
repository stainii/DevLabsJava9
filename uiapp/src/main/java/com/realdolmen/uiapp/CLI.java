package com.realdolmen.uiapp;

import com.realdolmen.controllerjava9.api.*;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the filepath: ");
        Main controller = new Main();
        String filePath = scanner.next();
        String randomLine = controller.getRandomLine(filePath);
        System.out.println();
        System.out.println("=============================");
        System.out.println("The randomly picked line: ");
        System.out.println(randomLine);
        System.out.println("=============================");

    }
}

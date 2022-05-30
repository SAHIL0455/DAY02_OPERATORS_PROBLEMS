package com.brigdelabs;

import java.util.Scanner;

public class DigitinWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Single Number");
        int num = scanner.nextInt();
        System.out.println("Convert Into Word");
        if (num == 1){
            System.out.println("one");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("There");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else if (num == 6) {
            System.out.println("Six");
        } else if (num == 7) {
            System.out.println("Seven");
        } else if (num == 8) {
            System.out.println("Eight");
        } else if (num == 9) {
            System.out.println("Nine");
        }

        System.out.println("Enter The Number like 1,10,100,1000");
        int num1 = scanner.nextInt();
        System.out.println("Convert Into Word");
        if (num1 == 10){
            System.out.println("ten");
        } else if (num1 == 100) {
            System.out.println("Hundred");
        } else if (num1 == 1000) {
            System.out.println("thousand");
        } else if (num1 == 1) {
            System.out.println("one");
        }
    }
}
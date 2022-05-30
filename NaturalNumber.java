package com.brigdelabs;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        int i = 1, sum = 0;
        while (i<=num){
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of Natural Number " +sum );
    }
}

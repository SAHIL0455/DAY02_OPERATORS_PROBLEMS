package com.brigdelabs;

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scanner.next();
        switch (word){
            case "a":
                System.out.println("This is vowel");
                break;
            case "e":
                System.out.println("This is vowel");
                break;
            case "i":
                System.out.println("This is vowel");
                break;
            case "o":
                System.out.println("This is vowel");
                break;
            case "u":
                System.out.println("This is vowel");
                break;
            default:
                System.out.println("This is Consonant");
        }
    }
}

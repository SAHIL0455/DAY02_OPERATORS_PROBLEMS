package com.brigdelabs;

import java.util.Scanner;

public class OperatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = scanner.nextInt();
        System.out.println("Enter the Second number");
        int b = scanner.nextInt();
        System.out.println("Enter the Third number");
        int c = scanner.nextInt();
        double first = a+b*c;
        double second = c+a/b;
        double third = a%b+c;
        double fourth = a*b+c;
        if (first > second && first > third && first > fourth){
            System.out.println("a+b*c is max");
        }else if (second > first && second > third && second > fourth) {
            System.out.println("c+a/b is max");
        }else if (third > first && third > second && third > fourth) {
            System.out.println("a%b+c is max");
        }else if (fourth > first && fourth > third && fourth >second) {
            System.out.println("a*b+c is max");
        }

        if (first < second && first < third && first < fourth) {
            System.out.println("a+b*c is min");
        }
         else if (second < first && second < third && second < fourth) {
            System.out.println("c+a/b is min");
        }else if (third < first && third < second && third < fourth) {
            System.out.println("a%b+c is min");
        }else if (fourth < first && fourth < third && fourth < second) {
            System.out.println("a*b+c is min");
        }
    }
}

package org.example;

import java.util.Scanner;

public class doWhil { //use the do while
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("In a number: ");
            number = sc.nextInt();
        }
        while (number <= 500);
    }
}


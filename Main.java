package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner pyramid = new Scanner(System.in);
        int height;
        do {
            System.out.print("Enter a height: ");
            height = pyramid.nextInt();
        } while (height < 1 || height > 8);
        rows(height);
    }

    static void rows(int r) {
        for (int i = 1; i <= r; i++) {
            for (int t = i; t < r; t++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}

package com.hasib.java.basic;

import java.util.Scanner;

/*
 * Created by S M Al Hasib on 7/23/20, 11:43 PM
 * Copyright (c) 2020 . All rights reserved.
 * Last modified 7/23/20, 11:42 PM
 */

public class Input {
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = scr.nextInt();
        System.out.println("Enter a another Number: ");
        int b = scr.nextInt();

        int result = a+b;
        System.out.println("The result: " + Input.square(result));
        System.out.println(Integer.parseInt("101011101", 2)); //convert string to integer
    }
}

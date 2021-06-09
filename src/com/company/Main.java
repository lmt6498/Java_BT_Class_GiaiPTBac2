package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = nhap.nextDouble();
        System.out.print("Nhập b: ");
        double b = nhap.nextDouble();
        System.out.print("Nhập c: ");
        double c = nhap.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.display());
    }
}

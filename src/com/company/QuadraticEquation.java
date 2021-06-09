package com.company;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta (){
        return Math.pow(b,2) - 4*a*c;
    }

    public double getX1 (){
        return (-b + Math.sqrt(getDelta()))/(2*a);
    }
    public double getX2 (){
        return (-b - Math.sqrt(getDelta()))/(2*a);
    }
     public double getNghiemKep (){
        return -b/(2*a);
    }
    public String display(){
        if (getDelta() < 0){
            return "Phương trình vô nghiệm!";
        }else if ( getDelta() == 0){
            return "Phương trình có 1 nghiệm: " +getNghiemKep();
        }else {
            return "Phương trình có 2 nghiệm phân biệt: \n X1: "+getX1() + "\nX2: "+getX2();
        }
    }
}

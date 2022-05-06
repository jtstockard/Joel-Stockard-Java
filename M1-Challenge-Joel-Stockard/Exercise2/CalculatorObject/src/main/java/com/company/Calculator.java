package com.company;

public class Calculator {
    //using integers to double
    public int add(int a, int b){
        int c = a+b;
        System.out.println(a + "+" + b + "=" + c);
        return c;
    }
    public int subtract(int a, int b){
        int c = a-b;
        System.out.println(a + "-" + b + "=" + c);
        return c;
    }
    public int multiply(int a, int b){
        int c = a*b;
        System.out.println(a + "*" + b + "=" + c);
        return c;
    }
    public int divide(int a, int b){
        int c = a/b;
        System.out.println(a + "/" + b + "=" + c);
        //cannot divide by 0
        if(b==0) return 0;
        return c;
    }
    public double add(double a, double b){
        double c = a+b;
        System.out.println(a + "+" + b + "=" + c);
        return c;
    }

    public double subtract(double a, double b){
        double c = a-b;
        System.out.println(a + "-" + b + "=" + c);
        return c;
    }
    public double multiply(double a, double b) {
        double c = a*b;
        System.out.println(a + "*" + b + "=" + c);
        return c;
    }
    public double divide(double a, double b) {
        double c = a / b;
        System.out.println(a + "/" + b + "=" + c);
        if(b==0) return 0;
        return c;
    }



}




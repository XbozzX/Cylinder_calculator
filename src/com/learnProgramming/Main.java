package com.learnProgramming;

import java.util.Currency;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle1 = new Circle(3.75);
        System.out.println("Circle radius= " + circle1.getRadius());
        System.out.println("Circle area= " + circle1.getArea());

        Cylinder cylinder1 = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder radius= " + cylinder1.getRadius());
        System.out.println("Cylinder height= " + cylinder1.getHeight());
        System.out.println("Cylinder area= " + cylinder1.getArea());
        System.out.println("Cylinder volume= " + cylinder1.getVolume());
    }
}

package com.learnProgramming;

public class Circle {
    // init the field
    private double radius;

    //create a constructor to init the field
    public Circle(double radius){
        //verify the condition of the field
        if (radius <= 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    //declare getter
    public double getRadius() {
        return radius;
    }

    //create getArea method to calculate the Area
    public double getArea(){
        double TotalArea = (radius * radius * Math.PI); //Formula
        return TotalArea;
    }
}


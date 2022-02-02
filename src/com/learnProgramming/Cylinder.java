package com.learnProgramming;

public class Cylinder extends Circle{
    //init the field
    private double height;

    //create the constructor for init the field
    public Cylinder(double radius, double height){
        super(radius);

        //verify the condition of the field
        if (height <= 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //declare the getter
    public double getHeight() {
        return height;
    }

    //create getVolume method to calculate the Volume
    public double getVolume() {
        double area = getArea(); //access the field inside the parent class
        double TotalVolume = this.height * area; //formula
        return TotalVolume;
    }
}

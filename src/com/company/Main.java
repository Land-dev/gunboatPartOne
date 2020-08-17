package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter distance to target: ");
        double distance;
        distance = reader.nextDouble();
        System.out.println("Enter the height of the battery relative to the water line: ");
        double height;
        height = reader.nextDouble();
        System.out.println("Enter the initial velocity: ");
        double velocity;
        velocity = reader.nextDouble();

        double a = -4.9*(distance/velocity)*(distance/velocity);
        double b = distance;
        double c = a + height;

        double tanThetaOne = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        double tanThetaTwo = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        double pi = 3.14159;
        double angleOne = Math.atan(tanThetaOne)*180/pi;
        double angleTwo = Math.atan(tanThetaTwo)*180/pi;

        System.out.println("The angles are " + angleOne + " and " + angleTwo);


    }
}

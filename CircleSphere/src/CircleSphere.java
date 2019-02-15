//Write a program that prompts the user for a double value representing a radius. You will use the radius to calculate:
//
//circleCircumference 
//circleArea 
//sphereArea 
//sphereVolume 

import java.util.Scanner;

public class CircleSphere{
   public static void main(String[]  args){
      Scanner scnr = new Scanner(System.in);
      double radius = 0;
      double pi = Math.PI;
      
      System.out.println("Enter radius: ");
      radius = scnr.nextDouble();
      
      double circleCircumference = 2 * pi * radius;
      double circleArea  = pi * Math.pow(radius, 2);
      double sphereArea  = 4 * pi * Math.pow(radius, 2);
      double sphereVolume = ((double)4/3) * pi * Math.pow(radius, 3);
	  
      System.out.println("Circle Circumference = "+circleCircumference);
      System.out.println("Circle Area = "+circleArea);
      System.out.println("Sphere Area = "+sphereArea );
      System.out.println("sphereVolume ="+sphereVolume);
   
   }

}

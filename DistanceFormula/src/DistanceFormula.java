//Write a program that prompts the user for the coordinates of both points, please note that all coordinates are double values. Your prompts must be:
//
//Coordinates for P1 
//Enter X1: 
//Enter Y1: 
//Coordinates for P2 
//Enter X2: 
//Enter Y2:
//
//Your output must be of the format:
//
//Distance between P1 and P2 = computed distance

import java.util.Scanner;
public class DistanceFormula{
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double x1;
      double x2;
      double y1;
      double y2;
      
      System.out.println("Coordinates for P1");
      System.out.println("Enter X1: ");
      x1 = scnr.nextDouble();
      System.out.println("Enter Y1: ");
      
      System.out.println("Coordinates for P2");
      y1 = scnr.nextDouble();
      System.out.println("Enter X2: ");
      x2 = scnr.nextDouble();
      System.out.println("Enter Y2: ");
      y2 = scnr.nextDouble();
      
      double insideSqrt = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
      double dist = Math.sqrt(insideSqrt);
      
      System.out.println("Distance between P1 and P2 = "+dist);
   }


}

// Progammer name:- Manish Nawadkar
// Problem statement:- Design a class Rectangle with data fields width,length, area and colour. The length, width and area are of double type and color is of string type. The methods are get_length(), get_width(), get_color(), and find_area().
// Create two objects of Rectangle and compare their Area and color. If the area and color of both are the same for 

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class Rectangle{
    double length,width,area;
    String color;
    Scanner sc = new Scanner(System.in);
    void get_length()
    {
        System.out.println("Enter the length:");
        length = sc.nextDouble();
    }
    void get_width()
    {
        System.out.println("Enter the breadth:");
        width = sc.nextDouble();
    }
    void get_color()
    {
        System.out.println("Enter the color of Rectangle:");
        color = sc.next();
    }
    void find_area()
    {
        System.out.println("The area is "+(length*width));
    }
};
class Main{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle();
        r1.get_length();
        r1.get_width();
        r1.get_color();
        r1.find_area();
        
        Rectangle r2 = new Rectangle();
        r2.get_length();
        r2.get_width();
        r2.get_color();
        r2.find_area();
        
        if (r1.area==r2.area && r1.color.equalsIgnoreCase(r2.color)) //The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
        {
            System.out.println("Matching Rectangles");
        }
        else
        {
            System.out.println("Non-Matching Rectangles");
        }
    }
}
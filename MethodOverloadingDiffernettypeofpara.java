// Progammer name:- Manish Nawadkar
// Problem statement:- Write a java program to perform method overloading using different data type of parameters

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class Add{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
}
class Main{
    public static void main(String args[])
    {
        Add a = new Add();
        int result_one = a.add(5,6);
        System.out.println("Sum1: "+result_one);
        double result_two = a.add(6.1,6.7);
        System.out.println("Sum2: "+result_two);
    }
}
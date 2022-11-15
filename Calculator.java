// Progammer name:- Manish Nawadkar
// Problem statement:- Implement a calculator with simple arithematic operations such as add,subtraction,multiplication,division,factorial etc.using switch case and other simple JAVA statements

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        char cnt;
        do
        {
            System.out.println("Following operations are available to perform:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication"); 
            System.out.println("4.Divison"); 
            System.out.println("5.Factorial");
            System.out.println("6.Enter 6 to end the progarm"); 
            
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    double a,b;
                    System.out.println("Enter the first number:");
                    a = sc.nextDouble();
                    System.out.println("Enter the Second number:");
                    b = sc.nextDouble();
                    System.out.println("Addition of two numbers "+a+" and "+b+" is "+ (a+b));
                    break;
                case 2:
                    double c,d;
                    System.out.println("Enter the first number:");
                    c = sc.nextDouble();
                    System.out.println("Enter the Second number:");
                    d = sc.nextDouble();
                    System.out.println("Subtraction of two numbers "+c+" and "+d+" is "+ (c-d));
                    break;
                case 3:
                    double e,f;
                    System.out.println("Enter the first number:");
                    e = sc.nextDouble();
                    System.out.println("Enter the Second number:");
                    f = sc.nextDouble();
                    System.out.println("Multiplication of two numbers "+e+" and "+f+" is "+ (e*f));
                    break;
                case 4:
                    double g,h;
                    System.out.println("Enter the first number:");
                    g = sc.nextDouble();
                    System.out.println("Enter the Second number:");
                    h = sc.nextDouble();
                    System.out.println("Divison of two numbers "+g+" and "+h+" is "+ (g/h));
                    break;
                case 5:
                    int num,fact=1;
                    System.out.println("Enter the number you want to find factorial for:");
                    num = sc.nextInt();
                    for (int i=2;i<=num;i++)
                    {
                        fact*=i;
                    }
                    System.out.println("The factorial of "+num+" is "+fact);
                    break;
                case 6:
                    System.out.print("Program Terminated");
                    System.exit(0);
                    
                default:
                    System.out.println("This is a wrong choice");
                    break;
            }
            System.out.println("Do you want to continue your calculations on the calculator?");
            System.out.println("If yes enter Y else enter N");
            cnt = sc.next().charAt(0);
        }while(cnt=='Y');
    }
}
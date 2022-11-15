// Progammer name:- Manish Nawadkar
// Problem statement:- Create a class Swapping to perform constructor overloading and method overloading.

/*Input : 'A',  'J'
Output : 'J', 'A'

Input: 20.2, 12.5
Output: 12.5, 20.2*/


import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class Swapping{
    
    public char one;public char two; // Intialisation of characters.
    public double a;public double b; // Intialisation of doubles.
    
    Swapping(char one, char two) // Declaration of characters.
    {
        this.one = one;
        this.two = two;
    }
    Swapping(double a,double b) // Declaration of doubles.
    {
        this.a = a;
        this.b = b;
    }
    
    void swap(char one, char two) // Swapping of characters.
    {
        char temp;
        temp = one;
        one = two;
        two = temp;
        System.out.println("After the swap "+one+" and "+two);
    }
    void swap(double a,double b) // Swapping of doubles.
    {
        double temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After the swap "+a+" and "+b);
    }
}
class Main{
    public static void main(String args[])
    {
        Swapping s1 = new Swapping('A','J');
        Swapping s2 = new Swapping(20.2,12.5);
        System.out.println("Before the swap A and J");
        s1.swap(s1.one,s1.two);
        System.out.println("Before the swap 20.2 and 12.5");
        s2.swap(s2.a,s2.b);
    }
}
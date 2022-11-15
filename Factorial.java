//Progammer Name:- Manish Nawadkar
//Problem statement:- Find a factorial of a number, take input from user

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long factorial = 1;
        for (int i=2;i<=num;i++)
        {
            factorial*=i;
        }
        System.out.print("The factorial of "+num+" is "+factorial);
    }
}
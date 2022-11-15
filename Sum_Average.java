//Progammer Name:- Manish Nawadkar
//Problem statement:- Find sum of 'n' numbers and their average

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        double average;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        average = (double)sum/(double)n;
        System.out.println("The sum of the numbers is "+sum+" and their average is "+average);
    }
}
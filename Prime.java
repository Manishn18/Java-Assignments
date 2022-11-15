//Progammer Name:- Manish Nawadkar
//Problem statement:- Display first 50 prime numbers

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class Main
{
    public static void main(String args[])
    {
        int countprime = 0;
        for (int i=2;i<=1000;i++)
        {
            boolean flag = true;
            for (int j=2;j<=Math.sqrt(i);j++)
            {
                if (i%j==0)
                {
                    flag = false;
                    break;
                }
            }
            if (flag==true)
            {
                countprime++;
                System.out.print(i+" ");
            }
            if (countprime==50) break;
        }
    }
}
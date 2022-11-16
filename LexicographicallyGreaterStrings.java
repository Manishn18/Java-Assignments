// Programmer name:- Manish Nawadkar
// Problem Statment:- Split string "hello world", then find lexiografically increasing pairs in each string and print it like, output:21 

import java.util.*;
class Main{
    public static void main(String args[])
    {
        String s1 = "abcd efgh";
        String [] arr = s1.split(" ");
        for (int i=0;i<2;i++)
        {
            int count = 0;
            for (int j=0;j<(arr[i].length())-1;j++)
            {
                String s2 = arr[i];
                if (s2.charAt(j)<s2.charAt(j+1))
                {
                    count++;
                }
            }
            System.out.print(count);
        }
    }
}
// Progammer name:- Manish Nawadkar
// Problem statement:- Matrix addition using 2-d array

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class MatrixAddition{
    int r,c;
    int a[][] = new int [10][10]; // intilisation of multidimensional array of size 10*10 
    Scanner sc = new Scanner(System.in);
    MatrixAddition() // for declaring number of rows and columns in matrix
    {
        System.out.println("Enter the number of rows:");
        r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        c = sc.nextInt();
    }
    MatrixAddition(int r,int c) // Target matrix number of rows and columns
    {
        this.r = r;
        this.c = c;
    }
    void get_data()
    {
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print("a["+i+"]["+j+"] = ");
                a[i][j] = sc.nextInt();
            }
        }
    }
    void display()
    {
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void add(MatrixAddition m)
    {
        if (r!=m.r || c!=m.c) // If number of rows of 1st matrix is not equal to number of rows of 2nd matrix then Addition is not possible same for cols of matrix
        {
            System.out.println("Number of rows and cols don't match hence Addition of matrices is not possible");
        }
        else
        {
            MatrixAddition m3 = new MatrixAddition(m.r,m.c); // Creating target matrix of size m.r and m.c
            for (int i=0;i<r;i++)
            {
                for (int j=0;j<c;j++)
                {
                    m3.a[i][j] = a[i][j]+m.a[i][j]; // adding matrix 1 and matrix 2 and storing the added value in matrix 3
                }
            }
            System.out.println("Elements of Addition Matrix:");
            m3.display(); //display of matrix 3(target matrix)           
        }
    }
}
class Main{
    public static void main(String args[])
    {
        System.out.println("Enter the number of rows and cols for 1st Matrix:");
        MatrixAddition m1 = new MatrixAddition();
        
        System.out.println("Enter the elements 1st Matrix:");
        m1.get_data();

        System.out.println("Enter the number of rows and cols for 2nd Matrix:");
        MatrixAddition m2 = new MatrixAddition();
        
        System.out.println("Enter the elements 2nd Matrix:");
        m2.get_data();
        
        System.out.println("Elements of first matrix are:");
        m1.display();
        
        System.out.println("Elements of second matrix are:");
        m2.display();
        
        m1.add(m2);
    }
}
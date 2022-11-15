// Progammer name:- Manish Nawadkar
// Problem statement:- Write a java program to perform method overloading using different order of parameters

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class Student{
    void test(String str,int roll)
    {
        System.out.println("Name:"+str+", Roll no:"+roll);
    }
    void test(int roll,String str)
    {
        System.out.println("Roll no:"+roll+", Name:"+str);
    }
}
class Main{
    public static void main(String args[])
    {
        Student s = new Student();
        s.test("Manish",32341);
        s.test(33112,"Ruchita");
    }
}
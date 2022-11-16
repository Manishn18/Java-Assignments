// Progammer name:- Manish Nawadkar
// Problem statement:- Write a program in java to create a player class. Inherit the class Cricket_Player(), Football_Player(), and Hockey_Player() from player class. The objective of this class is to learn the concept of inheritance.

import java.util.Scanner;
class Player{
    String name,team,age;
    double exp;
    Scanner input = new Scanner(System.in);
    void get_data()
    {
        System.out.println("Enter the Player's name:");
        name = input.next();
        System.out.println("Enter the Player's team:");
        team = input.next();
        System.out.println("Enter the Player's age:");
        age = input.next();
        System.out.println("Enter the Player's experience on field:");
        exp = input.nextDouble();
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Team:"+team);
        System.out.println("Age:"+age);
        System.out.println("Experience:"+exp);
    }
}
class Cricket extends Player{
    int match,runs;
    void get_data()
    {
        System.out.println("Cricket:");
        super.get_data();
        System.out.println("Enter the number of matches played:");
        match = input.nextInt();
        System.out.println("Enter the runs scored:");
        runs = input.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Matches:"+match);
        System.out.println("Runs:"+runs);
    }
}
class Football extends Player
{
    int matches,goals;
    void get_data()
    {
        System.out.println("Football:");
        super.get_data();
        System.out.println("Enter the number of matches played:");
        matches = input.nextInt();
        System.out.println("Enter the goals scored:");
        goals = input.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Matches:"+matches);
        System.out.println("Goals:"+goals);
    }
}
class Hockey extends Player
{
    int matches,goals;
    void get_data()
    {
        System.out.println("Hockey:");
        super.get_data();
        System.out.println("Enter the number of matches played:");
        matches = input.nextInt();
        System.out.println("Enter the goals scored:");
        goals = input.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Matches:"+matches);
        System.out.println("Goals:"+goals);
    }
}
class Main{
    public static void main(String args[])
    {
        Cricket c = new Cricket();
        c.get_data();
        c.display();
        Football f = new Football();
        f.get_data();
        f.display();
        Hockey h = new Hockey();
        h.get_data();
        h.display();
    }
}
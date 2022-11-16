// Programmer name:- Manish Nawadkar
// Problem statement:- Implement Queue using interface

import java.util.*;
class Queue
{
    int front;
    int rear;
    int capacity;
    int count;
    int a[];
    Queue(int x)
    {
        front = 0;
        rear = -1;
        capacity = x;
        count = 0;
        a = new int[capacity];
    }
}
interface Queue_implement
{
    void push();
    void pop();
    void display();
    int size();
    boolean isFull();
    boolean isEmpty();
}
class Queue_method extends Queue implements Queue_implement
{
    Scanner sc = new Scanner(System.in);
    Queue_method(int x)
    {
        super(x);
    }
    public void push()
    {
        System.out.print("Enter the element: ");
        int ele = sc.nextInt();
        if (isFull()) System.out.println("Queue is Full");
        else
        {
            rear++;
            a[rear] = ele;
            count++;
            display();        
        }
    }
    public void pop()
    {
        if (isEmpty()) System.out.println("Queue is Empty");
        else
        {
            int ele = a[front];
            front++;
            count--;
            display();        
        }
    }
    public void display()
    {
        for (int i=front;i<=rear;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public int size()
    {
        return count;
    }
    public boolean isFull()
    {
        return size()==capacity;
    }
    public boolean isEmpty()
    {
        return count==0;
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int s = sc.nextInt();
	    int ch;
	    int choice;
		Queue_method q = new Queue_method(s);
		do
		{
		    System.out.println("1.Push");
		    System.out.println("2.Pop");
		    choice = sc.nextInt();
		    switch(choice)
		    {
		        case 1:
		            q.push();break;
		        case 2:
		            q.pop();break;
		        default:
		            System.out.println("Wrong choice enetered by user");
		    }
		    System.out.println("Press 1 if you want to continue or else Press 0");
		    ch = sc.nextInt();
		}while(ch==1);
	}
}

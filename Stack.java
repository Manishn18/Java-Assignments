import java.util.*;
class Stack
{
    int top;
    int capacity;
    int count;
    int a[];
    Stack(int x)
    {
        top = -1;
        capacity = x;
        count = 0;
        a = new int[capacity];
    }
}
interface Stack_method
{
    void push();
    void pop();
    void display();
    boolean isFull();
    boolean isEmpty();
    int size();
}
class Stack_implement extends Stack implements Stack_method
{
    Scanner obj = new Scanner(System.in);
    Stack_implement(int x)
    {
        super(x); // Constructor Calling
    }
    public void push()
    {
        System.out.println("Enter the element you want to insert:");
        int ele = obj.nextInt();
        if (isFull())
        {
            System.out.println("Stack is Full");
        }
        else
        {
            top++;
            a[top] = ele;
            count++;
            display();
        }
    }
    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            int ele = a[top];
            top--;
            count--;
            display();
        }
    }
    public void display()
    {
        System.out.println("The Stack elements are as follows:-");
        for (int i=0;i<=top;i++)
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
        return capacity==size();
    }
    public boolean isEmpty()
    {
        return count==0;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int q = obj.nextInt();
	    Stack_implement r = new Stack_implement(q); // Constructor for intializing the size of stack
	    int ch;
	    do{
	        System.out.println("1.Push");
	        System.out.println("2.Pop");
	        int choice = obj.nextInt();
	        switch(choice)
	        {
	            case 1:
	                r.push();break;
	            case 2:
	                r.pop();break;
	            default:
	                System.out.println("You have entered the wrong choice");
	        }
	        System.out.println("Press 1 if you want to continue or else press 0");
	        ch = obj.nextInt();
	    }while(ch==1);
	}
}


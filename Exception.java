// Progammer name:- Manish Nawadkar
// Problem Statement:- Display various Exceptions such as ArrayIndexOutOfBoundsException,ArithmeticException,NullPointerException,NumberFormatException via JAVA program


package SimpleApplication;

class Exception{
	int a,b,c,len,ans;
	String str1="123456789101112131415161718";
	String str2=null;
	int arr[] = new int[3];
	void method()
	{
		try 
		{
			for (int i=0;i<=3;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		// The ArrayIndexOutOfBoundsException is a runtime exception in Java that occurs when an array is accessed with an illegal index. 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception: " + e);
		}
		try
		{
			a = 5;
			b = 0;
			c = a/b;
			System.out.println("The divsion obtained is:"+a/b);
		}
		// The arithmetic exception is a type of unusual outcome or unchecked error of the code, which is thrown or raised whenever a wrong mathematical or arithmetic operation appears in the code during run time.
		catch(ArithmeticException e)
		{
			System.out.println("Exception: "+e);
		}
		try
		{
			ans = Integer.parseInt(str1);
			System.out.print(str1);
		}
		// The NumberFormatException is an unchecked exception in Java that occurs when an attempt is made to convert a string with an incorrect format to a numeric value. Therefore, this exception is thrown when it is not possible to convert a string to a numeric type (e.g. int, float). 
		catch(NumberFormatException e)
		{
			System.out.println("Exception: "+e);
		}
		try
		{
			len = str2.length();
			System.out.println("The lenth obtained is: "+len);
		}
		// The java.lang.NullPointerException is a runtime exception in Java that occurs when a variable is accessed which is not pointing to any object and refers to nothing or null.
		catch(NullPointerException e)
		{
			System.out.println("Exception: "+e);
		}
	}
}
class Operation{
	public static void main(String args[])
	{
		Exception e = new Exception();
		e.method();
	}
}
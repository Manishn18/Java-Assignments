// Progammer name:- Manish Nawadkar
// Problem Statement:- File Handling

package SimpleApplication;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String args[])
	{
		// File Creation
		try
		{
			File f1 = new File("D:\\Local Disk D\\CP\\input.txt");
			File f2 = new File("D:\\Local Disk D\\CP\\output.txt");
			if (f1.createNewFile())
			{
				System.out.println("File created Succesfully");
			}
			if (f2.createNewFile())
			{
				System.out.println("File created Succesfully");
			}
		}
		catch(IOException e)
		{
			System.out.print("File Creation Failed"+e);
		}
		// File Writing
		try
		{
			FileWriter fw = new FileWriter("D:\\Local Disk D\\CP\\input.txt");
			String msg = "Manish Nawadkar";
			fw.write(msg);
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("File Writing Failed"+e);
		}
		// Copying msg from one file to another file
		try
		{
			FileReader fr = new FileReader("D:\\Local Disk D\\CP\\input.txt");
			FileWriter fw = new FileWriter("D:\\Local Disk D\\CP\\output.txt");
			int c;
			while((c=fr.read())!=-1)
			{
				fw.append((char)c);
				System.out.println((char)c);
			}
			fr.close();
			fw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Succesfuly done the operations");
		}			
	 }
}
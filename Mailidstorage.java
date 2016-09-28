import java.util.regex.*;
import java.io.*;  
import java.util.Scanner; 

class Mailidstorage
{  
   public static void main(String args[])
   {  
	Scanner in = new Scanner(System.in);
    String content ;
	FileWriter fw = null; 
	BufferedWriter bw = null; 
	PrintWriter pw = null;
	
	  System.out.println("Enter the Mail Id to Store : ");
	   content = in.nextLine();

      String pattern1 = ".*@gmail.com.*";
	  String pattern2 = ".*@yahoo.com.*";
	  String pattern3 = ".*@hotmail.com.*";

      boolean isMatch1 = Pattern.matches(pattern1, content);
	  boolean isMatch2 = Pattern.matches(pattern2, content);
	  boolean isMatch3 = Pattern.matches(pattern3, content);
	  
	  try 
	{
	
		if ((isMatch3 == false) && (isMatch2 == false) && (isMatch1 == false))
		{
		System.out.println("Please enter a valid email address.");
		}
		
		if (isMatch1 == true)
		{
			File file = new File("C:/Java Mail Storage/Gmail.txt");

            if (!file.exists()) 
			{
				System.out.println("File not found. Creating a file named Gmail.txt in C Drive");
                file.createNewFile();
            }

            fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw); 
			pw = new PrintWriter(bw);
			pw.println(content);
			pw.flush();
			pw.close();
		}
   
		if (isMatch2 == true)
		{
			File file = new File("C:/Java Mail Storage/Yahoo.txt");

            if (!file.exists()) 
			{
				System.out.println("File not found. Creating a file named Yahoo.txt in C Drive");
                file.createNewFile();
            }
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw); 
			pw = new PrintWriter(bw);
			pw.println(content);
			pw.flush();
			pw.close();
		}
   
		if (isMatch3 == true)
		{
			File file = new File("C:/Java Mail Storage/Hotmail.txt");

            if (!file.exists()) 
			{
				System.out.println("File not found. Creating a file named Hotmail.txt in C Drive");
                file.createNewFile();
            }
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw); 
			pw = new PrintWriter(bw);
			pw.println(content);
			pw.flush();
			pw.close();
		}
		
	}
   catch(IOException e) 
	{
         System.out.print("Error occurred wile execution.");
	}	
	}
}  
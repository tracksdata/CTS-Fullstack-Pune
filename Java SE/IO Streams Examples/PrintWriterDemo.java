import java.io.*;
class PrintWriterDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter f=new FileWriter("Test.txt");
			PrintWriter pw=new PrintWriter(System.out);
			pw.println(true);
			pw.println('S');
			pw.println(500);
			pw.println(4000l);
			pw.println(45.678);
			pw.println("Hello");
			pw.println(new Integer("99"));
			pw.close();
		}catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
	}
}

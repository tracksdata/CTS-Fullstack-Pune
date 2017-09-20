import java.io.*;
class FileWriterDemo
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw=new FileWriter(args[0]);
			for(int i=0;i<12;i++)
			{
				fw.write("line"+i+"\n");
			}
			fw.close();
		}catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
	}
}

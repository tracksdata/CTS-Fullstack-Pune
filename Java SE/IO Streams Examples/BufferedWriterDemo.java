import java.io.*;
class BufferedWriterDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw=new FileWriter(args[0]);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<12;i++)
			{
				bw.write("line"+i+"\n");
			}
			bw.close();
		}
			catch(Exception e)
			{
				System.out.println("Exception "+e);
			}
		}
	}	
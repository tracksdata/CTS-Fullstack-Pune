import java.io.*;
class SeqBuffIOStreams 
{
	public static void main(String[] args) throws Exception
	{
			FileInputStream f1=new FileInputStream("file1.txt");
			FileInputStream f2=new FileInputStream("file2.txt");
			SequenceInputStream f3=new SequenceInputStream(f1,f2);
			BufferedInputStream inbr=new BufferedInputStream(f3);
			BufferedOutputStream outbr=new BufferedOutputStream(System.out);
			int ch;
			try
		{
				while((ch=inbr.read())!=-1)
			{
					outbr.write((char)ch);
			}
		}catch(Exception e)
		{
			System.out.println("Error");
		}
		inbr.close();
		outbr.close();
		f1.close();
		f2.close();
	}
}

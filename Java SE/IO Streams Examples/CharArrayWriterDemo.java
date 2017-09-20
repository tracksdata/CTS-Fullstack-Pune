import java.io.*;
class CharArrayWriterDemo 
{
	public static void main(String[] args) throws Exception
	{
			CharArrayWriter f=new CharArrayWriter();
			String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char buff[]=new char[s.length()];
			s.getChars(0,s.length(),buff,0);
			f.write(buff);
			System.out.println("Buffer as a String");
			System.out.println(f.toString());
			System.out.println("Into array");
			char c[]=f.toCharArray();
			for(int i=0;i<c.length;i++)
		{
				System.out.print(c[i]);
		}
		System.out.println("\nTo a File Writer()");
		FileWriter f2=new FileWriter("Test.Txt");
		f.writeTo(f2);
		f2.close();
	}
}

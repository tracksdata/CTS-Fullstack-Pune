import java.io.*;
class CharArrayReaderDemo 
{
	public static void main(String[] args) throws Exception
	{
		String tmp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int len=tmp.length();
		char c[]=new char[len];
		tmp.getChars(0,len,c,0);
		CharArrayReader input1=new CharArrayReader(c);
		CharArrayReader input2=new CharArrayReader(c,0,5);
		int i;
		System.out.println("Input1 is:");
		while((i=input1.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Input 2 is :");
		while((i=input2.read())!=-1)
		{
			System.out.println((char)i);
		}
		System.out.println();
	}
}

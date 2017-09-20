import java.io.*;
class ByteArrayOutputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		ByteArrayOutputStream f=new ByteArrayOutputStream();
		String s="Stream nothing but flow of data.2 types are 1.InputStreams & 2. OutputStreams.., ";
		byte buff[]=s.getBytes();
		//f.write(buff);
		System.out.println("Buffer as a String");
		System.out.println(f.toString());
		System.out.println("Into Array");
		byte b[]=f.toByteArray();
		for(int i=0;i<b.length;i++)
		{
			System.out.print((char)b[i]);
		}
		System.out.println("\n to an Inputstream()");
		OutputStream f2=new FileOutputStream("Test.txt");
		f.writeTo(f2);
		f2.close();
		System.out.println("Doing a reset");
		f.reset();
		for(int i=0;i<3;i++)
		{
			f.write('X');
		}
		System.out.println(f.toString());
	}
}

import java.io.*;
class PushbackDemo
{
	public static void main(String args[]) throws IOException
	{
		String s="if(a==4) a=1;";
		byte b[]=s.getBytes();
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
		PushbackInputStream pis=new PushbackInputStream(bis);
		int ch;
		while((ch=pis.read())!=-1)
		{
			switch(ch)
			{
			case '=':
				if((ch=pis.read())=='=')
					System.out.print(".eq.");
				else
				{
					System.out.print("<-");
					pis.unread(1);
				}
				break;
			default:
				System.out.print((char)ch);
				break;
		
			}		
		}
		System.out.println((char)ch);
	}
}			
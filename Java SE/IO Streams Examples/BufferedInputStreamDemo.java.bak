import java.io.*;
class BufferedInputStreamDemo 
{
	public static void main(String[] args) throws Exception
	{
			String s="this is a &copy;copyright symbol"+" but this is & copy not .\n";
			byte buff[]=s.getBytes();
			System.out.println(buff);
			ByteArrayInputStream in=new ByteArrayInputStream(buff);
			BufferedInputStream f=new BufferedInputStream(in);
			int c;
			boolean marked=false;
			while((c=f.read())!=-1)
		{
				switch(c)
			{
				case '&' :
				if(!marked)
				{
						//f.mark(65);
						marked=true;
						System.out.print("%");
				}else
				{
					marked=false;
				}
				break;
				case ';' :
					if(marked)
				{
					marked=false;
					System.out.print("(C)");
				}else
					System.out.print((char)c);
				break;
				case ' ' :
					if(!marked)
				{
					marked=false;
					//f.reset();
					System.out.print("#");
				}
				else
					System.out.print((char)c);
					break;
					default :
						if(!marked)
						System.out.print((char)c);
					break;			
			}
	}
}
}
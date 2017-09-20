import java.io.*;

class  ListDemo1
{
	public static void main(String[] args) throws IOException
	{
		String path="f:"+"\\"+"7am"+"\\"+"classroom";
		File f = new File(path);
		if (f.isDirectory())
		{
			System.out.println("The Contents of the folder is...");
			String[] d = f.list();
			for (int i=0;i<d.length; i++ )
			{
				System.out.println(d[i]);
			}
		}
		else
		System.out.println("This is not a directory");
	}
}

import java.io.*;
class FileNameFilterDemo
{
	public static void main(String[] args) 
	{
		String dirname="/AllPack";
		File f1=new File(dirname);
		FilenameFilter only=new OnlyExt("java");
		String s[]=f1.list(only);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}

import java.io.File;
class FileDemo 
{
	static void p(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		File f1=new File ("Fcopy1.java");
		p("File name :"+f1.getName());
		p("path:"+f1.getPath());
		p("Parent:"+f1.getParent());
		p(f1.exists() ? "exists" : "Does not Exist");
		p(f1.canRead()?"is readable" :"does not Readable");
		p(f1.canWrite()?"is writable" :"does not writable");
		p("is" +(f1.isDirectory()? " ": " not "+" a directory"));
		p(f1.isFile()?" is normal File " :"might be a name pipe");
		p(" File last modified: "+f1.lastModified());
		p(" File size: "+f1.length() +" Bytes ");
	}
}

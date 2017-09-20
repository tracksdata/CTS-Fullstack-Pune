  //JavaCompiler.java
import java.io.*;
public class JavaCompiler
{
public static void main(String rags[]) throws Exception
{
Runtime rt=Runtime.getRuntime();

Process p=rt.exec("javac "+rags[0]);

InputStream in=p.getErrorStream();

DataInputStream dis=new DataInputStream(in);

String line=dis.readLine();
while(line!=null)
{
System.out.println(line);
line=dis.readLine();
}
dis.close();
in.close();
}
}
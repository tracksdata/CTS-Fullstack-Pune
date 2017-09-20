import java.io.*;
class CreateFile 
{
public static void main(String args[]) throws Exception
{
  File f=new File("D:/Ravi/INDIA.TXT");
if(f.createNewFile())
  System.out.println("File created");
else
  System.out.println("File not created");
 }
}
